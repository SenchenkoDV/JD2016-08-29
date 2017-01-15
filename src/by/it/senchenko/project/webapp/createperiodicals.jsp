<%@ page language="java" pageEncoding="UTF-8" %>
<%@ include file="include/begin-html.jsp" %>



<div class="row">
    <b>
        <div class=col-md-2>ID</div>
        <div class=col-md-2>Название издания</div>
        <div class=col-md-2>Издатель</div>
        <div class=col-md-2>Дата выхода издания</div>
    </b>
   </div>
   <hr>

   <div class="row">
           <form class="form-periodicals-${periodicals.ID}" action="do?command=CreatePeriodicals" method=POST>
               <div class=col-md-2>
                               <input id="periodicals_id_${periodicals.ID}" name="ID" type="text"
                               value="0" class="form-control input-md" readonly>
                           </div>

               <div class=col-md-2>
                   <input id="textinput" name="Name" type="text"
                   value="${periodicals.name}" class="form-control input-md">
               </div>
               <div class=col-md-2>
                   <input id="textinput" name="Author" type="text"
                   value="${periodicals.author}"     class="form-control input-md">
               </div>
               <div class=col-md-2>
                   <input id="textinput" name="Date" type="text"
                   value="${periodicals.date}" class="form-control input-md">
               </div>



               <div class=col-md-1>
                   <button id="singlebutton" name="singlebutton" class="btn btn-primary" >
                       Добавить
                   </button>
               </div>


           </form>
           </div>
      <br>
   <br>
   <c:forEach items="${periodical}" var="periodicals">
        <div class="row">
        <form class="form-periodicals-${periodicals.ID}" action="do?command=CreatePeriodicals" method=POST>
            <div class=col-md-2>
                            <input id="periodicals_id_${periodicals.ID}" name="ID" type="text"
                            value="${periodicals.ID}" class="form-control input-md">
                        </div>

            <div class=col-md-2>
                <input id="textinput" name="Name" type="text"
                value="${periodicals.name}" class="form-control input-md">
            </div>
            <div class=col-md-2>
                <input id="textinput" name="Author" type="text"
                value="${periodicals.author}" class="form-control input-md">
            </div>
            <div class=col-md-2>
                <input id="textinput" name="Date" type="text"
                value="${periodicals.date}" class="form-control input-md">
            </div>



            <div class=col-md-1>
                <button id="singlebutton" name="singlebutton" class="btn btn-success">
                    Обновить
                </button>
            </div>

            <div class=col-md-1>
                <button id="singlebutton" name="singlebutton"
                class="btn btn-danger"
                onclick="document.getElementById('periodicals_id_${periodicals.ID}').value=-document.getElementById('periodicals_id_${periodicals.ID}').value;"
                >
                    Удалить
                </button>
            </div>

        </form>
        </div>
   <br>
   </c:forEach>



<%@ include file="include/end-html.jsp" %>
