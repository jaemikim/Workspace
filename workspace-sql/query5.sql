-- INLINE VIEW

SELECT A.*
FROM
(
	SELECT NAME 
		, CREDIT_LIMIT 
	FROM CUSTOMERS c 
) A
;

SELECT A.*
FROM
	(   
		SELECT A.*
		FROM
		(
			SELECT NAME 
				, CREDIT_LIMIT 
			FROM CUSTOMERS c 
		) A
	) A
;

-- 연도별 각 고객의 매출 금액을 알려주세요. CROUP BY있는 내용이 SELECT의 내용이 있어야 한다.
SELECT 
	C.NAME AS CUSTOMER 
	, TO_CHAR(A.ORDER_DATE, 'YYYY') AS YEAR
	, SUM(B.QUANTITY * B.UNIT_PRICE) AS SALES_AMOUNT
FROM ORDERS A
	, ORDER_ITEMS B
	, CUSTOMERS C
WHERE 1 = 1  -- 참인 조건을 추가
	AND A.STATUS = 'Shipped'
	AND A.ORDER_ID = B.ORDER_ID  -- 공통컬럼을 A하고 B와 연결
	AND A.CUSTOMER_ID = C.CUSTOMER_ID -- 공통컬럼을 A하고 C와 연결 
GROUP BY C.NAME, TO_CHAR(A.ORDER_DATE, 'YYYY')
ORDER BY C.NAME 
;

-- 연도별 각 고객의 매출 금액 구하기 뷰 생성
CREATE OR REPLACE VIEW CUSTOMER_SALES AS
SELECT 
	C.NAME AS CUSTOMER 
	, TO_CHAR(A.ORDER_DATE, 'YYYY') AS YEAR
	, SUM(B.QUANTITY * B.UNIT_PRICE) AS SALES_AMOUNT
FROM ORDERS A
	, ORDER_ITEMS B
	, CUSTOMERS C
WHERE 1 = 1
	AND A.STATUS = 'Shipped'
	AND A.ORDER_ID = B.ORDER_ID
	AND A.CUSTOMER_ID = C.CUSTOMER_ID
GROUP BY C.NAME, TO_CHAR(A.ORDER_DATE, 'YYYY')
ORDER BY C.NAME 
;

SELECT *
FROM CUSTOMER_SALES cs 
;

-- 고객별 2017년도 매출 구하시오.
-- 고객, 매출액
SELECT CUSTOMER
	, SALES_AMOUNT 
FROM CUSTOMER_SALES 
WHERE YEAR = 2017
ORDER BY SALES_AMOUNT DESC 
;

-- 고객별 전체 매출 합께를 구하시오
-- 고객, 전체액
SELECT CUSTOMER
	, SUM(SALES_AMOUNT) AS SUM_SALES_AMOUNT
FROM CUSTOMER_SALES 
GROUP BY CUSTOMER 
ORDER BY SUM_SALES_AMOUNT DESC 
;