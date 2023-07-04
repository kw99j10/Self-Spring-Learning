# 1day -백엔드 기초
<br/>
<h2>web 아키텍처 (Client 와 Server)</h2>
Client (Front-End 단) – Browser 화면의 구성 (HTML: 컨텐츠의 구조화 + CSS: 스타일링, 배치 + JS: 동적 처리, 서버통신(DOM, AJAX)) 
<br>
--> 반응형 web 사이트 제작 필요(사용자의 기기 환경에 따라 browser 화면은 다를 수 있음) 
<br>--> UI Framework(ex: bootstrap)

- React.js, Vue.js: 프론트엔드 단에서 백엔드 단과 통신을 해주는 기술 set
- view와 controller의 통신(response,request):
controller(유효성 검사) -> service model(transaction 관리) -> dao model -> dbms
Server (WAS) – JS(node JS - 자바스크립트 런타임 환경) <br><br>

<h2>MVC 요소</h2>
<p>Model: domain data(entity data), data access logic(DAO), business(service) logic</p>
<p>화면적인 응답: html - 프론트의 화면과 기술이 달라지면 백엔드는 그에 따라 제공해야 하는 화면이 달라짐
<p>data 응답: 필요한 data만 보내면 각기 다른 UI를 cover 가능 (rest API)</p><br>
<p>View: 보여지는 화면
<p>Controller: View와 Model 사이의 요청 및 응답의 흐름을 제어함. (유효성 검사)
<br><br>
  
<h2>Servlet</h2>
동적 웹 페이지 기술 - java 진영<br>
<p>-servlet: java <- html, xml, json ....
<p>-jsp: html, xml, json <- java 
<br><br>
번호가 높을수록 상위 interface
<p>1. Servlet (모든 통신 프로토콜을 허용)
– init(): 생성 후 1번 호출, service(): 요청마다 수행, destroy(): 소멸 직전 1번 호출<br>
<p>2. GenericServlet: 추상 클래스 – 객체 생성 불가, service() 메서드를 넣어 상속받는 클래스에서 이를 재정의 하도록 함
<p>3. HttpServlet: http protocol에 특화된 servlet (service를 직접 정의하지 않음, 요청 방식에 따른 함수 지정 Get, Post...)

<br>
request가 들어오면 객체가 memory에 있는지 검사 -> 없으면 객체 생성(new) 및 초기화(init) -> ready(준비 상태)
<br> -> 있으면 바로 준비상태로 -> 이 후 response를 보냄 -> destroy(1번) <br>
jsp: (jsp 코드 -> java -> class) 과정 + servlet 과정으로 jsp는 곧 servlet의 확장 버전

서버 쪽은 데이터 인코딩, 단일값, 배열값을 데이터로 받아옴

<br><hr>
# 2day - 스프링 프레임워크
<br/>
<h3>주요 내용</h3>
<p>- Spring framework: enterprise application 개발에 필요한 기반 기능을 제공함
<p>- DI: 의존성(의존 객체) 주입
<p>- MVC 구조 학습
<br>
<h2>Session Tracking</h2>
HTTP: request/response (비연결성 -> 무상태성): 부족한 자원을 효율적으로 사용 가능
<p>●비연결성: 요청에 대한 응답이 들어오면 연결을 끊음
<p>●무상태성: 서버가 클라이언트에 대한 상태를 유지하지 않음 – 서버 확장성 증가

<h3>●	stateful 하게 만들어 주는 기술</h3>
<h5>Cookie: Client Side에 상태를 저장(문자열 data만 저장 가능)</h5>
<p>-	쿠키의 유지 시간을 줄 수 있음(file 형태), 
<p>-	주지 않는다면 브라우저 실행 메모리에 저장(세션 쿠키)
<p>-	기본 생성자가 없음(키와 쌍을 갖음)

<h5>Session: Server Side에 상태를 저장(객체형도 가능)</h5>
<p>- 상태들이 모여 있는 저장소
<p>-	사용자 별로 세션이 만들어짐
<p>-	쿠키를 차단하면 세션에 접근할 수 없음
<p>-	세션 저장소는 만들거나 접근함
<p>-	세션 소멸: s.invalidate(); (1)로그아웃, (2) 세션 타임아웃 설정
<p>-	서버 side의 메모리 부담 증가 및 확장 어려움
<br>
<h2>페이지 이동 기법</h2>
<p><a>forwarding:</a> 서버 내부에서 요청을 처리함 – URL 변화 X, 요청 & 응답 1번 발생(객체 재사용 O)
<p><a>redirection:</a> 브라우저에게 새 페이지를 불러오도록 함 – 요청 & 응답이 2번 발생(객체 재사용 X)
<br><hr>

