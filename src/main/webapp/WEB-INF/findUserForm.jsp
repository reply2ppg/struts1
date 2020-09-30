<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:layout>
 <t:errorMessage message="${errorMessage}"/>
    <t:form action="findUser">
        <t:numberfield name="id" label="Enter Id" rquired="true"/>
        <t:submit/>
    </t:form>
</t:layout>