<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ include file="../common/menu.jsp" %>
		<!-- Start Hero Section -->
			<div class="adopt">
				<div class="container">
					<div class="d-flex justify-content-end"">
						<div class="adopt_title">
								<h1 class="fw-bold">입양</h1>
								<h3 class="fw-bold">펫숍 쇼윈도에 진열된 동물의 이면에는 <br />또 다른생명의 고통이 있을 수 있습니다. </h3>

								<p><a href="" class="btn btn-success shadow-sm me-2">입양 절차</a><a href="#" class="btn btn-success shadow-sm">입양양식</a></p>
						</div>
					</div>
				</div>
			</div>
		<!-- End Hero Section -->

<div class="container">

	<div class="container-fluid m-5">
	
		<div class="bg-white rounded">
		<div class="row">
			<div class="col-lg-6">
				<div class="p-4" >
				
								<div class="slick-list draggable">
								<img class="img-fluid w-100 rounded" src="../images/36209.jpg">
								</div>
	 			</div>
	
			</div>
	
			<div class="col-lg-6 g-pl-50--lg p-4">
	
				<h1 class="h3 g-color-primary font-weight-bold mt-4">
					<!-- GA 클래스 추가 -->
					<span class="animal_name">단지</span>
					<span class="g-color-gray-dark-v5 g-font-weight-400 g-font-size-12 text-uppercase">D2022100601</span>			
				</h1>
	
				<hr class="my-4">
	
				<ul class="list-unstyled mb-0">
					<li class="media mb-1">
						<div class="d-flex w-30 w-sm-25">
							<small class="text-muted"> 종<!-- /품종 --> </small>
						</div>
						<div class="media-body">
							<h3 class="h6">개</h3>
						</div>
					</li>
					<li class="media mb-1">
						<div class="d-flex w-30 w-sm-25">
							<small class="text-muted"> 성별(중성화) </small>
						</div>
						<div class="media-body">
							<h3 class="h6">암컷 / 중성화 O</h3>
						</div>
					</li>
					<li class="media mb-1">
						<div class="d-flex w-30 w-sm-25">
							<small class="text-muted"> 추정나이 </small>
						</div>
						<div class="media-body">
							
							
							<h3 class="h6">
							1살  
							3개월
							</h3>						
						</div>
					</li>
					<li class="media mb-1">
						<div class="d-flex w-40 w-sm-30">
							<small class="text-muted"> 몸무게 </small>
						</div>
						<div class="media-body">
							<h3 class="h6">10.6kg</h3>
						</div>
					</li>
					<li class="media mb-0">
						<div class="d-flex w-40 w-sm-30">
							<small class="text-muted"> 털색 </small>
						</div>
						<div class="media-body">
							<h3 class="h6 mb-0">화이트</h3>
						</div>
					</li>
	
				</ul>
	
				<hr class="my-5">
	
				<div class="g-mt-10">		
						<!-- 입양하기 -->
						<!-- GA 클래스 추가 detail_adopt_application_event -->
						<a href="/adopt/application/ko/create?name=%EB%8B%A8%EC%A7%80" target="_blink"><button class="btn btn-block btn-primary detail_adopt_application_event" type="button">입양하기</button></a>
				</div>
				
			</div>
		</div>

</div>
	
	
	</div>
	
</div>


	
	<%@ include file="../common/footer.jsp" %>