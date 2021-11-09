<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Patient List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Doctor ID</th>
<th> Patient ID</th>
<th>DateOfRequest</th>
<th>DateOfAppointment</th>
<th>PatientContactno</th>
</tr>  
   <c:forEach var="doc" items="${list}">   
   <tr>  
   <td>${doc.DOC_ID}</td>  
   <td>${doc.PAT_ID}</td>  
   <td>${doc.DATE_OF_REQUEST}</td>  
   <td>${doc.DATE_OF_APPOINTMENT}</td>  
    <td>${doc.PATIENT_CONTACT}</td> 
   </tr>  
   </c:forEach>  
   </table>  
   <br/>