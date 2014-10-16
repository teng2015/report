<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:choose>
	<c:when test="${pageContext.request.serverPort eq 80}">
		<c:set var="base" value="${pageContext.request.scheme}://${pageContext.request.serverName}${pageContext.request.contextPath}" />
	</c:when>
	<c:otherwise>
		<c:set var="base" value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}" />
	</c:otherwise>
</c:choose>
<c:set var="actionExt" value="gfan"/>
