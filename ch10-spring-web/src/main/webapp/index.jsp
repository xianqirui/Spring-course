<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>注册学生</p>
<form action="reg" method="post">
    <table>
        <tr>
            <td>id:</td>
            <td><label>
                <input type="text" name="id">
            </label></td>
        </tr>
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>email:</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td>年林：</td>
            <td><input type="text" name="age"></td>
        </tr>
        <td>提交</td>
        <td><input type="submit" value="注册学生"></td>
    </table>
</form>

</body>
</html>
