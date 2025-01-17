# Moviewiki Project
### 무비위키는 사용자 경험을 기반으로 취향에 맞는 영화를 추천해주는 웹사이트를 제작하는 프로젝트이다.
#### 무비위키 사이트의 **주요 기능**은 다음과 같다.

1. 추천 기능
   * 사용자 정보 기반 추천
     * 성별, 연령대, 선호장르, 선호배우, 선호감독, 선호국가, MBTI 등
   * 리뷰, 팔로우 기반 추천
     * 내가 높게 평가한 영화를 높게 평가한 사람이 높게 평가한 영화 추천
     * 내가 팔로우한 사람이 높게 평가한 영화 추천
   * 계절, 날씨 기반 추천
     * 장르, 줄거리, 리뷰에서 키워드 추출하여 계절, 날씨와 매치
   * 추천 알고리즘 외 방식
     * 게시판 포스트를 통한 컨텐츠 제공
2. 검색 기능
   * 제목/감독/출연배우/장르/국가 등으로 검색
   * 평점순/관심순/제목순/최신순/리뷰순 등으로 정렬
3. 리뷰 기능
   * 시청한 영화에 평점 달기
   * 시청한 영화에 코멘트 달기
   * 다른 사람 코멘트에 좋아요
4. 마이페이지(유저페이지)
   * 내 취향 분석 페이지
   * 시청한 영화(내 리뷰 관리)
   * 나의 관심(찜) 영화
   * 회원등급제
   * 팔로우 관리
5. 기타 회원관리 기능
   * 가입, 탈퇴, 로그인, 로그아웃, 회원정보수정

#### 이 프로젝트는 2021년 7월부터 2021년 9월까지 약 3개월의 기간동안 5인의 팀원이 **Java 1.8**, **Spring**, **Oracle DB**, **JPA**를 사용하여 개발했으며 관련 내용은 [GitHub](https://github.com/moviewiki-team/moviewiki)(코드 버전 관리), [Notion](https://www.notion.so/hip-tablecloth-89b)(회의록, 일정 관리), [Google Drive](https://drive.google.com/drive/folders/1LWBwnqdfA8amZ1mKw6PPa81LmBxjikeu)(UML 등 문서 관리)에서 볼 수 있다.

### 이 리파지토리에서는 기존의 프로젝트를 개인적으로 리팩토링하여 버전업할 예정이다.(2022.05~)