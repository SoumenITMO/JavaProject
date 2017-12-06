<%--
  Created by IntelliJ IDEA.
  User: Scott
  Date: 12/6/2017
  Time: 8:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="../bootstrap/js/jquery-1.8.3.min.js"></script>
<script src="../assets/common-header-js.js" type="application/javascript"></script>
<div id="header">
<div class="container">
<div id="welcomeLine" class="row">
<div class="span6">Welcome!<strong> ${userName}</strong></div>
<div class="span6">
<div class="pull-right">
<a href="product_summary.html"><span class="">Fr</span></a>
<a href="product_summary.html"><span class="">Es</span></a>
<span class="btn btn-mini">En</span>
<a href="product_summary.html"><span>&pound;</span></a>
<span class="btn btn-mini">$155.00</span>
<a href="product_summary.html"><span class="">$</span></a>
<a href="product_summary.html"><span class="btn btn-mini btn-primary"><i class="icon-shopping-cart icon-white"></i> [ 3 ] Itemes in your cart </span> </a>
</div>
</div>
</div>
<div id="logoArea" class="navbar">
<a id="smallScreen" data-target="#topMenu" data-toggle="collapse" class="btn btn-navbar">
<span class="icon-bar"></span>
<span class="icon-bar"></span>
<span class="icon-bar"></span>
</a>
<div class="navbar-inner">
<a class="brand" href="/"><img src="themes/images/logo.png" alt="Bootsshop"/></a>
<form class="form-inline navbar-search" method="post" action="products.html" >
<input id="srchFld" class="srchTxt" type="text" />
<select class="srchTxt">
<option>All</option>
<option>CLOTHES </option>
<option>FOOD AND BEVERAGES </option>
<option>HEALTH & BEAUTY </option>
<option>SPORTS & LEISURE </option>
<option>BOOKS & ENTERTAINMENTS </option>
</select>
<button type="submit" id="submitButton" class="btn btn-primary">Go</button>
</form>
<ul id="topMenu" class="nav pull-right">
<li class=""><a href="special_offer.html">Specials Offer</a></li>
<li class=""><a href="normal.html">Delivery</a></li>
<li class=""><a href="contact.html">Contact</a></li>
<li class="">

<a href="${modalbtn}" role="button" data-toggle="modal" style="padding-right:0">
<span class="btn btn-large btn-success ${loginbtnclass}">${loginbtntxt}</span>
</a>

<div id="login" class="modal hide fade in" tabindex="-1" role="dialog" aria-labelledby="login" aria-hidden="false" >
<div class="modal-header">
<button type="button" class="login close" data-dismiss="modal" aria-hidden="true">x</button>
<h3>Login Block</h3>
</div>
<div class="modal-body">
<form class="form-horizontal loginFrm">
<div class="control-group">
<input type="text" id="inputEmail" placeholder="Email" class="mail_txt">
</div>

<div class="control-group">
<input type="password" id="inputPassword" placeholder="Password" class="pwd_txt">
</div>
<div class="control-group">
<label class="checkbox">
<input type="checkbox"> Remember me
</label>
</div>
</form>
<button type="submit" class="btn btn-success login_">Sign in</button>
<button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
</div>
</div>
</li>
</ul>

</div>
</div>
</div>
</div>
