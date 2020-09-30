<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="users" type="java.util.List<org.superbiz.struts.User>" scope="request"/>
<t:layout title="List all users">
    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${users}" var="user">
            <tr>
                <th>${user.id}</th>
                <th>${user.firstName}</th>
                <th>${user.lastName}</th>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</t:layout>