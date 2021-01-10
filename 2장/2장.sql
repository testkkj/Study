/**************************************************
* SELECT 명령
* SELECT * FROM 테이블명;
**************************************************/


/**************************************************
* SELECT * FROM sample21;
SELECT         : 명령의 종류
*(애스테리스크) : 모든 열
sample21       : 테이블명
;              : 명령문의 마지막

SELECT *      : SELECT 구
FROM sample21 : FROM 구

SELECT * FROM : 예약어
**************************************************/
SELECT * FROM sample21;

/**************************************************
* DESC 명령
* DESC 테이블명;
**************************************************/

/**************************************************
* DESC 명령으로 테이블의 구조를 볼수있다.
* 자료형
* INTEGER : 수치형 / 정수값 / 소수점불가
* CHAR    : 고정 길이 문자열 / 최대길이 지정해야 함
            최대길이보다 작으면 공백이 나머지를 채움
* VARCHAR : 가변 길이 문자열 / 최대길이 지정해야 함
            데이터에 맞춰서 길이가 지정됨
* DATE    : 날짜값 자료형 연월일의 데이터
* TIME    : 시간을 저장 / 시분초의 데이터
**************************************************/
DESC sample21;

/**************************************************
* SELECT 구와 WHERE 구
* SELECT 열1, 열2 FROM 테이블명 WHERE 조건식
**************************************************/

/**************************************************
* SELECT 구에서 열 지정
* SELECT 열1, 열2 FROM 테이블명
* SELECT 구에서 결과로 표시하고 싶은 열을 지정
**************************************************/
SELECT no, name FROM sample21;
