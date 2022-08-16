# 목차
- [목차](#목차)
- [DI](#DI)
    - [Dependency(의존 관계)란?](#Dependency(의존-관계)란?)
    - [Dependency를 인터페이스로 추상화](#Dependency를-인터페이스로-추상화)
    - [DI(의존 관계 주입)란?](#DI(의존-관계-주입)란?)
# DI
## Dependency(의존 관계)란?
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

https://steady-coding.tistory.com/600