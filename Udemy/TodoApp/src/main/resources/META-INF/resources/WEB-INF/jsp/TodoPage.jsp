<!-- 
<!DOCTYPE html>
<html lang="en">
    
    <%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>
    
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title> Welcome to ToDo List </title>
    </head>
    <body>
        <h1>Welcome ${name}!</h1>
        <h1>Following are the list of todos: -</h1>
    <h2>${todo}</h2> 
    <table>
        <thead>
            <tr>
                <th>id</th>
                <th>description</th>
                <th>Target Date</th>
                <th>Is Done?</th>
            </tr>
        </thead>
        
        <tbody>
            <c:foreach items="${todos}" var="todo">
                <tr>
                    <td>${todo.id}</td>
                    <td>${todo.description}</td>
                    <td>${todo.targetdate}</td>
                    <td>${todo.done}</td>
                </tr>
            <c:foreach/>   
        </tbody>
    </table>

</body>
</html>

 -->




 <!DOCTYPE html>`
 <html lang="en">
 <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
 </head>
 <body>
    <h1>Hello Aaditya</h1>
 </body>
 </html>


 