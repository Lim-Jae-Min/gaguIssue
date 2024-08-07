## 가구 유통 ERP - 가구이쓔(GAGUISSUE)

![image](https://github.com/user-attachments/assets/c64f060b-c239-49e8-8a8b-31f5a9b6cb9a)

<br><br>

## 프로젝트 선정이유
유통 업계는 단순한 제품의 이동뿐만 아니라, 재고 관리, 창고 운영, 인사 관리 등 여러 측면에서 효율적인 관리가 필요하다. 이와 같은 복잡한 관리 업무는 많은 시간과 비용을 소모하며, 잘 못된 관리로 인해 큰 손실을
초래할 수 있다. 이에, 불편함을 해소하고자 유통 통합 ERP시스템을 구축하기로 하였다.

<br><br>

## 개발 환경
- **Back-end**: Java
- **Front-end**: HTML/CSS, Bootstrap, JavaScript, jQuery
- **View**: JSP
- **Framework**: Spring Boot, MyBatis
- **DB**: MariaDB
- **WAS**: Tomcat (웹서버가 따로 없어서 Tomcat을 웹서버로 사용함)
- **Infra**: Amazon Web Services
- **버전 관리**: GitHub, SourceTree

<br><br>

## 👌🏻 전체 구현 기능
* 📝 전자결재
* 🧑‍💼 인사관리
* 📊 통합 데이터 공유 및 분
* 📦 재고 관리
* 📅 캘린더
* 📧 메일
* 📨 쪽지(채팅)
* 🛃 거래처 관리
* 🏭 창고 관리

<br><br>



## 내가 맡은 기능 및 설명

**[ 📨 쪽지(채팅) ]**
* 통신 방식은 Ajax를 이용한 비동기 방식을 사용하여 구현
* 어떤 페이지에서든 사용할 수 있도록 상단바에 쪽지기능을 배치

|![2024-08-01012945-ezgif com-optimize](https://github.com/user-attachments/assets/81bb8c52-72c5-4940-bdda-4a3662430777)|
|:--:|
| 상단바 쪽지 |

<br>

* 채팅방을 생성과 동시에 방이 생성되도록 설정
* 쪽지가 오면 상단바에서 읽지 않은 쪽지(채팅)을 확인 할 수 있다.

| ![ezgif com-optimize](https://github.com/user-attachments/assets/7f82ef11-7c67-4092-baa7-346edc7214bd)| ![ezgif com-video-to-gif-converter](https://github.com/user-attachments/assets/4b801c0a-28c1-4b65-8a0d-6d96095bdd84)|
|:--:|:--:|
| 채팅방 생성 및 보내기 | 나에게 온 채팅 확인 |

<br>

* 특정 직원의 간략한 정보를 확인할 수 있다.

|![image](https://github.com/user-attachments/assets/fea65683-34b0-4aec-a6e7-28a092350c7d)|
|:--:|
| 직원 정보 |

<br><br>


**[ 🛃 거래처 관리 ]**
* 거래처를 생성, 수정, 삭제가 가능
* 거래처 상세 보기 가능

|![ezgif com-video-to-gif-converter (1)](https://github.com/user-attachments/assets/3ff9673f-4522-45e0-995e-c1e92853589a)|
|:--:|
| 거래처 추가 |

<br>

|![ezgif com-video-to-gif-converter (2)](https://github.com/user-attachments/assets/31207bcd-c541-453a-88e2-94802228970b)|
|:--:|
| 거래처 수정 |


<br>

|![ezgif com-video-to-gif-converter (3)](https://github.com/user-attachments/assets/4852cd03-80cd-4d33-8947-f814a8ccb91b)|
|:--:|
| 거래처 삭제 |

<br><br>

**[ 🏭 창고 관리 ]**
* 창고 구역마다 상품 수량을 확인할 수 있다.

|![image](https://github.com/user-attachments/assets/0afb9b9f-783a-40d2-ae9f-6ec53987924c)|
|:--:|
| 창고 관리 |

[🎇 프로젝트 후기 ]

스프링 부트를 사용하여 다양한 기능을 구현하면서 효율성과 생산성을 경험하였다. 





