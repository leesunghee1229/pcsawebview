### 웹뷰
 * 로딩바 보이도록... (실제 로딩이 이뤄질때만 나오도록 처리해야함.)
 * 스크롤바 보이도록... (div 가 overflow:scroll 일경우 스크롤이 보이지 않음)
 * 외부 링크일경우 새로운 액티비티가 뜨고 x 버튼이 있게 처리.
 * 네트워크 오류일때 페이지 찾을수 없을경우... 예외처리 해놔야함.
 * splash activity 를 만들어놨는데 제대로 만든건지 궁금함.


### GCM , FCM
 * 알림, 다이얼로그, 이미지 전송
 * 클릭하면 해당 링크로 이동시킬것! (외부링크, 해당 activity)
 * 뱃지 기능 (서버와 연동하는 방법 등등...)

```sh
curl -X POST --header "Authorization: key=AAAA2gaPFxY:APA91bFjJRMu0PjWHyNTzJP0M4nbcv38aEzkJzpfn9aVaYoFwI8HicM8_JdUbi79aQrMIWfHMBEuSSz90JrypIxj9BLm0RtE_l1E0vpDqQ3hnbgx84UcRFHPKCFs1PezNdMef5QdBLok6WEzWn_crbnHaSXkLh3RqQ" --Header "Content-Type: application/json" https://fcm.googleapis.com/fcm/send -d "{\"to\":\"d9KW-STu5V8:APA91bFGrsk0EezEUzYvYnDbJcFi7zl9-fLaa63ygvhHrVBxxAFPvoDv6QaeFuxcQ9AaXqwhONrHsXFncgM-qdPOC3juLWMFFpGiQVpNRmZhB3RD0qOtQqmLrpBBC0X9SuAHQwKgTrPI\",\"notification\":{\"body\":\"Yellow\"},\"priority\":10}"
curl -X POST --header "Authorization: key=AAAA2gaPFxY:APA91bFjJRMu0PjWHyNTzJP0M4nbcv38aEzkJzpfn9aVaYoFwI8HicM8_JdUbi79aQrMIWfHMBEuSSz90JrypIxj9BLm0RtE_l1E0vpDqQ3hnbgx84UcRFHPKCFs1PezNdMef5QdBLok6WEzWn_crbnHaSXkLh3RqQ" --Header "Content-Type: application/json" https://fcm.googleapis.com/fcm/send -d "{\"to\":\"d9KW-STu5V8:APA91bFGrsk0EezEUzYvYnDbJcFi7zl9-fLaa63ygvhHrVBxxAFPvoDv6QaeFuxcQ9AaXqwhONrHsXFncgM-qdPOC3juLWMFFpGiQVpNRmZhB3RD0qOtQqmLrpBBC0X9SuAHQwKgTrPI\",\"notification\":{\"body\":\"Yellow\",\"title\":\"title Yellow\"},\"priority\":10}"

# push token
d9KW-STu5:APA91bFGrsk0EezEUzYvYnDbJcFi7zl9-fLaa63ygvhHrVBxxAFPvoDv6QaeFuxcQ9AaXqwhONrHsXFncgM-qdPOC3juLWMFFpGiQVpNRmZhB3RD0qOtQqmLrpBBC0X9SuAHQwKgTrPI
```

### 기타 등등
 * 앱 스토어 등록
 * 강제 업데이트 버전관리
 *


### [목표] 영업용 후즈콜
 * 딜러가 후즈콜을 설치하면 전화가 올때 어떤 고객인지 서로 공유할 수 있다.
 * 딜러는 걸려온 전화에 대해서 간략하게 내용을 적어서 공유한다.
 * 앱을 실행하면 걸려온 전화에 대해서 공유된 내용을 확인 할 수 있다.
 * 배달사원 위치 파악하기
 * brodcastreceiver 를 이용하여 전화가 오면 해당 activity 가 팝업처럼 뜨고 관련 정보 조회하도록...
 * call catcher
 * [관련 링크](http://gun0912.tistory.com/46)






