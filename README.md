# android_cleanarchitecture_sample
안드로이드 클린 아키텍처 프레임

모듈 구조 및 디렉토리 구조를 설정

MVVM + Retrofit + Room + Hilt

![toptal-blog-image-1543413671794-80993a19fea97477524763c908b50a7](https://user-images.githubusercontent.com/26853549/216267014-394973ea-5b26-458e-b00e-235a33a486be.png)

![www charlezz com-clean-architecture-diagram-flow](https://user-images.githubusercontent.com/26853549/197118067-632722ea-63f8-4cd7-9b85-817f1b963dba.png)


## 계층간 의존성 규칙

### Presentation

domain, data 모듈에 의존한다. 프레젠테이션 계층은 UI와 관련된 코드를 캡슐화한다. 모든 UI와 관련된 컴포넌트 또는 안드로이드 프레임워크와 관련된 코드들을 이 계층에서 다루게 된다.

UI 코드를 한 곳에서 관리함으로써 비즈니스 로직을 보호하고, 테스트도 쉽게 만든다.

### Domain

domain 모듈은 앱의 중심부로써 이 계층에 포함된 비즈니스 로직은 앱을 구성하고 있는 것 중 가장 중요한 부분이다. 그래서 비즈니스 로직을 망쳐서는 안되기 때문에 이 계층은 어떠한 계층에도 의존하지 않는다.

- Entity : 특정 영역을 표현하는 객체. ex) Pojo, VO, DTO 등
- UseCase : Entity와 함께 비즈니스 로직을 수행한다.
- Repository 인터페이스 : 데이터베이스, 원격 서버와 같은 데이터 소스에 접근한다.

### Data

data 모듈은 데이터 소스(DB, 서버 등)와 상호작용을 담당하는 코드가 포함되는 곳이다. 
data 모듈은 domain 모듈에 의존한다.

- 데이터 입출력 코드를 하나의 계층에서 관리한다.
- 데이터 소스들과 데이터를 소비하는 다른 계층과의 경계를 둔다.

```
Entity : 변경이 되서는 안되는 Data Class. 가장 기본이 되는 Data Class 로 Api 에서 내려오는 데이터 형식이 바뀌어도 Entity 는 영향이 없도록 해야한다. 
즉, 변경가능성이 높은 API 같은 경우에는 Entity 가 아니라 DTO 라고 생각해야 한다.
DB 입장에서는 해당 값들이 변경되면 안되는 값들이기 때문에 Entity 로 어노테이션을 선언하여 사용한다.

DTO : 변경이 쉽게 가능한 Data Class. 데이터 형태나 구조가 바뀔 수 있는 경우 사용하는 Data Class.      
DTO 를 가공하여 Entity 에 넣어 사용하기 때문에, 실제로 사용하는 데이터가 변경되지 않는 이상 다른 구조에 영향이 없다.

Mapper : Data Entity to Data Model
Data Layer 에서는 Data Entity 로 받아서 사용하지만, Domain, Presentation Layer 에서는 
Data Model 로 사용한다.
즉, Mapper 는 Data Layer 에 존재하면서 다른 계층으로 Data 를 전달할 때, 사용하는 Data Model 에 맞춰서 변환하여 던지는 역할.
```
