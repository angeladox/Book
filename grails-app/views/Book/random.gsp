<html>
<head>
    <g:javascript library="jquery" plugin="jquery"/>
	<r:require module="jquery"/>
     <r:layoutResources />
</head>

<body>	
	<ul id="menu">
		<li>  
		   <g:remoteLink action="ajaxRandom" update="displayBook"> Next Book </g:remoteLink>
		</li>
		<li> 
		   <g:link action="list"> Admin
		</g:link>
		</li>		
	</ul>
	
	<div id="displayBook">
		<p>Title:  ${aBook.title}</p>
		<p>Author:  ${aBook.author}</p>
		<p>Description: ${aBook.description}</p>
		<p>Minimum Grade Level: ${aBook.minGradeLevel}</p>
		<p>Maximum Grade Level: ${aBook.maxGradeLevel}</p>
		<p>Language: ${aBook.language}</p>
		<p>Category: ${aBook.category}</p>
		<p>ISBN: ${aBook.ISBN}</p>
		
	</div>
 <r:layoutResources/>
 		
</body>

</html>
