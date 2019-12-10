<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/12/2019
  Time: 9:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h1>Simple calculator</h1>
  <fieldset>
    <legend>Calculator</legend>

    <form method="post" action="/calculator">
      <p>First operand: </p><input type="text" name="1stOperand" value="0">
      <p>Operator: </p>
      <select name="operator" id="operator">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
      </select>
      <p>Second operand: </p><input type="text" name="2ndOperand" value="0">
      <input type="submit" value="Calculate">
    </form>
  </fieldset>
  </body>
</html>
