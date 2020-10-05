<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Queue Data Structure</title>
</head>
<body>

<h1>RESTful Queue</h1>
            <form id="form2" name="Queue Form2" action="QueueOperation" method="post" >
             Add element to Queue:
            <input type="text" name="addElement" />
            <input type="submit" value="Add" />
            <br>
            Remove element from Queue:
            <input type="text" name="removeElement" />
            <input type="submit" value="Remove" />
            <br>
             Display all elements in Queue:
            <input type="submit" value="Display" />
        </form>
        
</body>
</html>