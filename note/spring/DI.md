# 목차
- [목차](#목차)
- [DI](#DI)
    - [Dependency(의존관계)란?](#Dependency(의존관계)란?)
    - [Dependency를 인터페이스로 추상화](#Dependency를-인터페이스로-추상화)
    - [DI(의존관계주입)란?](#DI(의존관계주입)란?)
- [DI(의존관계주입) 구현 방법](#DI(의존관계주입)-구현-방법)
  - [필드 주입](#필드-주입)
  - [수정자 주입](#수정자-주입)
  - [생성자 주입](#생성자-주입)
- [출처](https://steady-coding.tistory.com/600)
## Dependency(의존관계)란?
* “A가 B를 의존한다”는 굉장히 추상적인 표현이지만, 토비의 스프링에서는 “의존 대상 B가 변하면, 그것이 A에 영향을 미친다”고 한다. 즉, B의 기능이 추가되거나 변경되면 그 영향이 A에 미치는 것이다.
```java
class BurgerChef {
    private HamBurgerRecipe hamBurgerRecipe;

    public BurgerChef() {
        hamBurgerRecipe = new HamBurgerRecipe();        
    }
}
```
* 위 코드의 경우, 햄버거 레시피가 변화게 되었을 때, 변화된 레시피에 따라서 BurgerChef 클래스를 수정해야 한다. 레시피의 변화가 요리사의 행위에 영향을 미쳤기 때문에 요리사는 레시피에 의존한다고 말할 수 있다.
## Dependency를 인터페이스로 추상화
* 위 예제를 보면, BurgerChef는 HamburgerRecipe만 의존할 수 있는 구조로 되어 있다. 더 다양한 햄버거 레시피를 의존할 수 있게 구현하려면 인터페이스로 추상화해야 한다.
```java
class BurgerChef {
    private BurgerRecipe burgerRecipe;

    public BurgerChef() {
        burgerRecipe = new HamBurgerRecipe();
        //burgerRecipe = new CheeseBurgerRecipe();
        //burgerRecipe = new ChickenBurgerRecipe();
    }
}

interface BugerRecipe {
    newBurger();
} 

class HamBurgerRecipe implements BurgerRecipe {
    public Burger newBurger() {
        return new HamBerger();
    }
}
```
* 위 코드에서 볼 수 있듯이, 다양한 버거 레시피에 의존할 수 있는 BurgerChef가 되었다. 이처럼 의존 관계를 인터페이스로 추상화하게 되면, 더 다양한 의존 관계를 맺을 수 있고, 실제 구현 클래스와의 관계가 느슨해지며 결합도가 낮아진다.

## DI(의존관계주입)란?
* 지금까지의 구현에서는 BurgerChef 내부적으로 의존관계인 BurgerRecipe가 어떤 값을 가질지 직접 정하고 있다. 이때 DI는 어떤 햄버거 레시피를 만들지는 버거가게 사장님이 정하는 상호ㅘㅇ이라 할 수 있다. 즉, BurgerChef가 의존하고 있는 BurgerRecipe를 외부(사장님)에서 결정하고 주입하는 것이다.
```java
class BurgerChef {
    private BurgerRecipe burgerRecipe;

    public BurgerChef(BurgerRecipe bugerRecipe) {
        this.burgerRecipe = bugerRecipe;
    }
}

//의존관계를 외부에서 주입 -> DI
new BurgerChef(new HamBurgerRecipe());
new BurgerChef(new CheeseBurgerRecipe());
new BurgerChef(new ChickenBurgerRecipe());
```
이처럼 그 의존 관꼐를 외부에서 결정하는 것을 DI(의존 관계 주입)라 한다.
# DI(의존관계주입) 구현 방법
## 필드 주입
```java
@Service
public class BurgerService {

    @Autowired
    private BurgerRecipe burgerRecipe;
}
```
변수 선업부에 @Autowired 어노테이션을 붙인다.
* 장점
  * 사용하기 편하다.
* 단점
  * 단일책임원칙 위반가능성이 커진다.
    * @Autowired 선언만 하면 되므로 의존성을 주입하기 쉽다.
    * 따라서, 하나의 클래스가 많은 책임을 갖게 될 가능성이 높다.
  * 의존성이 숨는다.
    * 생성자 주입에 비해 의존관계를 한눈에 파악하기 어렵다.
  * DI컨테이너와의 결합도가 커지고 테스트하기 어렵다.
  * 불변성을 보장할 수 없다.
  * 순환 참조가 발생할 수 있다.
## 수정자 주입
```java
@Service
public class BurgerService {

    private BurgerRecipe burgerRecipe;

        @Autowired
    public void setBurgerRecipe(BurgerRecipe burgerRecipe) {
        this.burgerRecipe = burgerRecipe;
    }
}
```
setter를 사용한 주입이다.
* 장점
  * 선택적인 의존성을 사용할 수있다.
* 단점
  * 선택적인 의존성을 사용할 수 있다는 것은 BurgerService에 모든 구현체를 주입하지 않아도 burgerRecipe 객체를 생성할 수 있고, 객체의 메소드를 호출할 수 있다. 즉, 주입받지 않은 구현체를 사용하는 메소드에서 NPE가 발생한다.
  * 순환 참조 문제가 발생할 수있다.
## 생성자 주입
```java
@Service
public class BurgerService {

    private BurgerRecipe burgerRecipe;

        @Autowired
    public BurgerRecipe(BurgerRecipe burgerRecipe) {
        this.burgerRecipe = burgerRecipe;
    }
}
```
생성자에 @Autowired 어노테이션을 붙여 의존성을 주입받을 수 있으며, 가장 권장되는 주입 방식이다.

* 장점
  * 의존 관계를 모두 주입해야만 객체 생성이 가능하므로 NPE를 방지할 수 있따.
  * 블변성을 보장할 수 있다.
  * 순환 참조를 컴파일 단계에서 찾아낼 수 있다.
  * 의존성을 주입하기 번거롭고, 생성자 인자가 많아지면 코드가 길어져 위기감을 느낄 수 있다.
    * 이를 바탕으로 SRP원칙을 생각하게 되고, 리팩터링을 수행하게 된다.
