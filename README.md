# Getting Started

新人向け学習コンテンツ

以下の環境で作成しましたがバージョンによって大きく影響を与えるような課題にはしないつもりです。

Java環境： openjdk version "21.0.1" 2023-10-17

またこのプロジェクトはVSCodeで作成しておりますので`.vscode`ファイルは配置しております。

利用しているVSCode Extension: Extension Pack for Java

## Practice1

### 事前準備

このプロジェクトを`git clone`して`src/practice1/App.java`を実行できることを確認しておいてください。以下の結果が出れば問題ありません。


```
全ての仕事が完了しました
```

※ `src/practice1/BackendEngineer.java`および`src/practice1/FrontendEngineer.java`でエラーが発生するのは問題ありません。


### 演習

以下のクラス図をもとにEngineerクラスを実装し、以下の出力結果を出してください。

#### 手順
* `src/practice1/App.java`のコメントアウトは外してください
* `src/practice1/Engineer.java`　ファイル作成してください
  * ファイルの最初に`package practice1;`を記載するの忘れずに
* `src/practice1/Engineer.java`の中身を作成してください

#### ルール
* `BackendEngineer.java`と`FrontendEngineer.java`、`App.java`は編集不可とします

#### 補足説明
* クラス図はPlantUMLで記載しています
  * イタリック表現はabstractを意味します
  * Aの◯はabstract classです
  * Cの◯はclassです
  * 赤の□はアクセスレベルのprivateです
  * 緑の●はアクセスレベルのpublicです

クラス図
<img width="350" src="https://github.com/ryo-ma/newcomer_practice/assets/6661165/fc530808-d25a-4c86-b0a8-f7320b86273f">


期待する出力結果

```
田中：仕事を開始します
バックエンドの構成を設計します
Djangoを使って実装します
pytestを使ってテストをします
田中：仕事が完了しました

鈴木：仕事を開始します
画面設計をします
NextJSを使って実装をします
Jestを使ってテストをします
鈴木：仕事が完了しました

全ての仕事が完了しました
```

## Practice2

### 事前準備

git pullをして最新版を取得してください。

### 演習

コンストラクタを使わずに子クラス(BackendEngineer、FrontendEngineer)から親クラス(Engineer)へ`name`を渡せるようにして期待通りの出力結果を出してください。

期待する出力結果

```
田中：仕事を開始します
バックエンドの構成を設計します
Djangoを使って実装します
pytestを使ってテストをします
田中：仕事が完了しました

鈴木：仕事を開始します
画面設計をします
NextJSを使って実装をします
Jestを使ってテストをします
鈴木：仕事が完了しました

全ての仕事が完了しました
```

#### 事前手順

1. `src/practice1`以下のファイルを`src/parctice2`へコピーする
2. `src/practice2/BackendEngineer.java`、`src/practice2/FrontendEngineer.java`、`src/practice2/Engineer.java`、`src/practice2/App.java`の最初の行`package practice1;`から`package practice2;`に変更する
3. `src/practice2/Engineer.java`からコンストラクタを消す
4. `src/practice2/Engineer.java`から`private String name;`を消す
5. 各種ファイルを変更して実装する(App.javaは修正しません)
