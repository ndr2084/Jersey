<%--
  Created by IntelliJ IDEA.
  User: william
  Date: 12/6/24
  Time: 11:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<body bgcolor = "#f0f0f0">


${user.get_first_name()} ${user.get_last_name()}
<form action="bid" method="post"></form>
<h1 align = "center"> WELCOME TO AUCTIONS-R-US </h1>
  <p>Please select the item you want to bid for:</p>
  <input type="radio" id="s1" name="checked" value="forward:50:TV:id_123">
  <label for="s1"> Item 1</label><br>
  <input type="radio" id="s2" name="checked" value="dutch:100:Lamp:id_456">
  <label for="s2"> Item 2</label><br>
  <input type="radio" id="s3" name="checked" value="forward:34:Golf Club:id_789">
  <label for="s3"> Item 3</label><br><br>
  <input type="submit" value="Select Item">
</form>
</body>
</html>
