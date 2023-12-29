<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ include file="../common/menu.jsp" %>
		<!-- Start Hero Section -->
			<div class="adopt">
				<div class="container">
					<div class="d-flex justify-content-end"">
						<div class="adopt_title">
								<h1 class="fw-bold">입양 후기</h1>
								<h3 class="fw-bold">쵸쵸를 통해 입양하신 분들은 누구나! <br/>입양후기를 올려주세요. </h3>

								<p><a href="" class="btn btn-success shadow-sm me-2 px-3">글쓰기</a></p>
						</div>
					</div>
				</div>
			</div>
		<!-- End Hero Section -->

	<div class="container">	
		 <div class="block mt-5">
		 
          <div class="row justify-content-center">

            <div class="col-md-8 col-lg-8 pb-4">

              <form>
                <div class="row mb-3">
                  <div class="col-6">
                    <div class="form-group">
                      <label class="text-black" for="fname">작성자</label>
                      <input type="text" class="form-control" id="fname">
                    </div>
                  </div>
                  <div class="col-6">
                    <div class="form-group">
                      <label class="text-black" for="lname">작성일</label>
                      <input type="text" class="form-control" id="lname">
                    </div>
                  </div>
                </div>   
               
			   <div class="form-group mb-3">
                  <label class="text-black" for="email">제목</label>
                  <input type="email" class="form-control" id="email">
                </div>
                <div class="form-group mb-3">
                  <label class="text-black" for="message">내용</label>
                  <textarea name="" class="form-control" id="message" cols="30" rows="8"></textarea>
                </div>
   			   <div class="form-group mb-4">
                  <label class="text-black" for="email">첨부타일</label>
                  <input type="email" class="form-control" id="email">
                </div>                

               <a class="btn btn-dark shadow-sm h-25 px-4" href="review_write.jsp" role="button">저장</a>
               <a class="btn btn-dark shadow-sm h-25 px-4" href="review_write.jsp" role="button">재작성</a>
               <a class="btn btn-dark shadow-sm h-25 px-4" href="review_write.jsp" role="button">취소</a>
              </form>

            </div>

          </div>

        </div>
			
	</div>
	
	
	<%@ include file="../common/footer.jsp" %>