<%@ page language="java" pageEncoding="UTF-8" %>
<%@ include file="include/begin-html.jsp" %>

<form class="form-horizontal" action="do?command=PROFILE" method="POST">

   <fieldset>

        <!-- Form Name -->
        <legend>Профиль пользователя</legend>
            <span class="label label-warning">Логин: </span>
            <p>${user.login}</p>
            <span class="label label-warning">Пароль: </span>
            <p>${user.email}</p>

        <!-- Button -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="LogoutButton"></label>
            <div class="col-md-4">
                <button id="LogoutButton" name="LogoutButton" value="1" class="btn btn-success">Завершить сеанс</button>
            </div>
        </div>

        <legend>Объявления ${user.login}</legend>
        <div class="row">
                             <div class="col-md-5"><span class="label label-success"><big>Название издания</big></span></div>
                             <div class="col-md-4"><span class="label label-success"><big>Издатель</big></span></div>
                             <div class="col-md-3"><span class="label label-success"><big>Дата выхода издания</big></span></div>

                    </div>
                 <c:forEach items="${periodicals}" var="periodicals">
                           <div class="row">
                             <p></p>
                             <div class="col-md-5">${periodicals.name}</div>
                             <div class="col-md-4">${periodicals.author}</div>
                             <div class="col-md-3">${periodicals.date}</div>
                           </div>
                 </c:forEach>

    </fieldset>
</form>

<%@ include file="include/end-html.jsp" %>
