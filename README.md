# eureka-back-server

## 로컬 설정

별도 `.env` 없이 기본 `local` 설정으로 `127.0.0.1:8761`에서 수신합니다. 프로필·포트·바인딩 변경은 OS 환경 변수 또는 실행 인수로 지정합니다.

전체 포트·프로필·설정 검증은 워크스페이스의 [로컬 환경 가이드](../LOCAL_DEVELOPMENT.md)를 따릅니다.

서비스 디스커버리를 위한 Eureka 서버입니다. 다른 백엔드 서비스가 이 레지스트리에 자신을 등록하고 서로를 찾습니다.

## 역할
- 서비스 등록/조회
- 로컬 개발 시 기본 discovery 서버 역할

## 포트
- `8761`

## 실행
```bash
./gradlew :eureka-back-server:bootRun
```

## 빌드 / 테스트
```bash
./gradlew :eureka-back-server:compileJava
./gradlew :eureka-back-server:test
```

## 참고
- 다른 서비스보다 먼저 띄우는 편이 안전합니다.
- `registerWithEureka: false`, `fetchRegistry: false`로 자기 자신은 client 동작을 하지 않습니다.
