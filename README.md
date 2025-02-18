
# 오늘의 일기장 - 오일(Dayily Diary)
![KakaoTalk_Photo_2022-02-17-18-27-50](https://user-images.githubusercontent.com/97504973/154446288-a3b27461-95eb-4c9a-974d-6f0f1ba5ec9f.jpeg)


# 팀원 정보
![팀원](https://user-images.githubusercontent.com/97504973/154441744-8e09d90b-9922-4fea-8ab0-102e76c71c8b.png)

# 1. 프로젝트 개요(Project).🎵

### 프로젝트 소개(Introduction).
    
오늘 하루 어땠나요?

힘든 날이었나요? 좋은 날이었나요? 자칫하면 의미없는 날로 지나갈 수 있는 
매일의 일상을 기록하며, 오늘의 나를 되돌아 보고, 또 다른 유저들과 일상을 공유하며, 
시시콜콜한 이야기, 감정을 나누어 볼수 있는 데일리 다이어리를 적어봅니다~!!

### 프로젝트 기간(Schedule).

2022년 2월 11일 ~ 2022년 2월 17일

- 2월 11일 금: 프로젝트 주제선정, 와이드프레임 작성 및 API 설계
- 2월 12일 토: DB선정, 로그인, 회원가입 구현
- 2월 14일 월: 게시글 CURD 구현, 1차배포
- 2월 15일 화: 댓글 CRUD 구현 및 오류 수정.
- 2월 16일 수: 테스트 후 수정 및 2차 배포
- 2월 17일 목: 프론트와 연결 및 최종 배포

# 2. 개발환경( Development).❤️

### 와이어 프레임(Wireframe)

![팀원1](https://user-images.githubusercontent.com/97504973/154443516-7859226c-570e-47f9-a498-7ac1edc1ccad.png)
![팀원3](https://user-images.githubusercontent.com/97504973/154443527-d53685a6-e588-452a-aed4-e3be4a1edc5f.png)
![팀원2](https://user-images.githubusercontent.com/97504973/154443537-cbcbd86c-9b57-4fea-beba-4c309beb7e4f.png)

## API 설계(API Table)

![111111](https://user-images.githubusercontent.com/97504973/154630156-8eda365e-5293-4706-9cd1-5729a5e0ab1b.png)
![2222222](https://user-images.githubusercontent.com/97504973/154630174-66e4c4f6-379a-4cc6-b25e-497b42228c63.png)

## 테이블 도표(Entity Diagram)

![도표](https://user-images.githubusercontent.com/97504973/154630803-493d0081-4b84-434c-bb47-769733e6cf6f.png)

# 3. 기술 스택(Tech Stack).🙅🏻‍♂️

## 핵심기능(Function).

- 로그인, 회원가입
    - JWT를 이용하여 로그인과 회원가입을 구현하였습니다.
    - 아이디는 3글자 이상 10글자 숫자,영문자 소/대문자로 구성해야합니다.
    - 비밀번호는 4글자 이상으로 구성해야 합니다.
    - 유저프로필 등록할 수 있습니다.
    - 닉네임을 이미 사용 중이면 회원가입이 불가능합니다.
- 메인 페이지
    - 전체 게시글을 조회 합니다.
    - 마이페이지로 이동할 수 있습니다.
    - 로그아웃을 구현했습니다.
    - 게시글을 눌러 상세페이지로 이동할 수 있습니다.
    - 등록한 이미지목록이 보이도록 구현했습니다.
    - 페이지 우측 하단에 버튼을 눌러 게시글 작성 페이지로 이동합니다.
- 마이페이지.
    - 본인이 작성한 글만 조회 합니다.
    - 로그아웃을 구현했습니다.
    - 게시글을 눌러 상세페이지로 이동할 수 있습니다.
    - 페이지 우측 하단에 버튼을 눌러 게시글 작성 페이지로 이동합니다.
    - 등록한 이미지목록이 보이도록 구현했습니다.
- 상세페이지(CRUD)
    - 로그아웃을 구현했습니다.
    - 마이페이지로 이동할 수 있습니다.
    - 페이지 우측 하단에 버튼을 눌러 게시글 작성 페이지로 이동합니다.
    - JWT를 이용하여 삭제 기능을 구현하였습니다. 삭제 후 메인페이지로 이동합니다.
    - 본인 글 수정버튼을 눌러 수정페이지로 이동합니다.
    - 댓글 작성 기능을 구현하였습니다.
    - 댓글 삭제 기능을 구현하였습니다.
- 수정페이지
    - 로그아웃을 구현했습니다.
    - 게시글을 눌러 상세페이지로 이동할 수 있습니다.
    - 페이지 우측 하단에 버튼을 눌러 게시글 작성 페이지로 이동합니다.
    - JWT를 이용하여 본인 글 수정버튼을 눌러 수정페이지로 이동합니다.
- 글작성 페이지
    - 로그아웃을 구현했습니다.
    - 마이페이지로 이동할 수 있습니다.
    - 이모티콘기능을 구현했습니다.
    - 태그기능을 구현했습니다.
    - 게시글을 공개 / 비공배(마이페이지)로 체크하는 기능을 구현했습니다.
    - 작성기능을 구현했습니다.  작성후 메인페이지로 이동합니다.

## 개발도구(Tools).

![기술](https://user-images.githubusercontent.com/97504973/154630912-63128979-7275-444f-af34-583de69a407c.png)

# 4. 데모영상 및 개발노션.♣️

Demo link : https://youtu.be/ey0leGmB97Y

Notion link : www.notion.so/Dayily-Diary-e3d8f48497bf4eb28d533bdbbdd2704f

# 5. 트러블 슛팅(Trouble Shooting).🚶🏻‍♂️

1. CORS 정책으로 인한 접속문제.
- (1) 에러 내용
    
    ![https://user-images.githubusercontent.com/87135478/145666395-7f840620-48a8-43a9-b371-ca1b0a26fee7.png](https://user-images.githubusercontent.com/87135478/145666395-7f840620-48a8-43a9-b371-ca1b0a26fee7.png)
    
    (2) 해결
    
    [//WebSecureConfig.java](https://websecureconfig.java/) 파일 내, CORS 관련 설정 추가
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    http
    .cors()
    .and()
    .csrf()
    .disable();
    
    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    CorsConfiguration configuration = new CorsConfiguration();
    
    ```
    configuration.addAllowedMethod("*");
    configuration.addAllowedHeader("*");
    configuration.addExposedHeader("Authorization");
    configuration.setAllowCredentials(true); // 서버가 응답할 때 json을 자바스크립트에서 처리할 수 있도록 함
    configuration.addAllowedOriginPattern("*");
    
    source.registerCorsConfiguration("/**", configuration);
    return source;
    }

2. Entity에 ImageUrl List 추가하는 문제**
    - 바로 삽입할 수 가 없어서 ImageUrl table을 따로 만들고 Diary와 연관관계를 맺어 controller와 service에서 다시 request값을 리스트화 시켜 저장하는 방법을 사용하였다.

