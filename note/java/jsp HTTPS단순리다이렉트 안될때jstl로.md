<%--http 리다이렉트--%>
<c:if test="${pageContext.request.scheme eq 'http'}">
<c:if test="${not empty requestScope['javax.servlet.forward.query_string']}">
<c:set var="reurl" value="https://${pageContext.request.serverName}${uri}?${requestScope['javax.servlet.forward.query_string']}" ></c:set>
</c:if>
<c:if test="${empty requestScope['javax.servlet.forward.query_string']}">
<c:set var="reurl" value="https://${pageContext.request.serverName}${uri}"></c:set>
</c:if>
<c:redirect url="${reurl}"></c:redirect>
</c:if>
