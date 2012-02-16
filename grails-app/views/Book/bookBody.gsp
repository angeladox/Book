<html>
<head> 
   <g:javascript library="jquery" plugin="jquery"/>
	<r:require module="jquery"/>
</head>

<body>
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
