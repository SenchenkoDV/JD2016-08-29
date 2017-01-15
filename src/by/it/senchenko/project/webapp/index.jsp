<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ include file="include/begin-html.jsp" %>

      <!-- Основное содержимое -->
      <div class="page-header">
        <h1>Периодические издания</h1>

      </div>

            <div class="row">
                     <div class="col-md-5"><span class="label label-success"><big>Название издания</big></span></div>
                     <div class="col-md-4"><span class="label label-success"><big>Издатель</big></span></div>
                     <div class="col-md-3"><span class="label label-success"><big>Дата выхода издания</big></span></div>

            </div>
         <c:forEach items="${periodical}" var="periodicals">
                   <div class="row">
                     <p></p>
                     <div class="col-md-5">${periodicals.name}</div>
                     <div class="col-md-4">${periodicals.author}</div>
                     <div class="col-md-3">${periodicals.date}</div>
                   </div>
         </c:forEach>
 <!--
      <h3>Периодические издания</h3>
      <p>Строка делится на 12 частей. Для каждой колонки таблицы
         можно указать класс .col-md-N, где N-число частей</p>
      <div class="row">
        <div class="col-md-1">.col-md-1</div>
        <div class="col-md-3">.col-md-3</div>
        <div class="col-md-2">.col-md-2</div>

      </div>

      <div class="row">
        <div class="col-md-1">Название издания</div>
        <div class="col-md-3">Издатель</div>
        <div class="col-md-2">Дата выхода издания</div>
      </div>

-->

<%@ include file="include/end-html.jsp" %>
