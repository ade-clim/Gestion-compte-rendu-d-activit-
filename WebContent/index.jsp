<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title><bean:message key="app.titre" /></title>
	<html:base />
    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	 <%@ include file="WEB-INF/jsp/connexioncss.jsp" %>
    <!-- Custom styles for this template -->
  </head>

  <body class="text-center">
    <html:form action="login" focus="login">
      <img class="mb-4" src="./img/logo.svg" alt="" width="100" height="100">

      <!--CODE A IMPLENTER -->
      <p class="sr-only">Login</p>
      <span id="inputEmail" class="form-control"><html:text property="login"/></span>
	  <html:errors property="login"/><br>
      <label class="sr-only">Password</label>
      <span id="inputPassword" class="form-control"><html:text property="password"/></span>
      <html:errors property="password"/><br>
      <div class="checkbox mb-3">
        <html:select property="role">
        	<html:option value="Manager">Manager</html:option>
        	<html:option value="Collaborateur">Collaborateur</html:option>
        </html:select>
      </div>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Connexion</button>
      <p class="mt-5 mb-3 text-muted">&copy; afpa2018, by amine & aurelien.</p>
      </html:form>
      <!--CODE A IMPLENTER -->

  </body>
</html:html>