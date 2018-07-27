node {
  stage('SCM Checkout') {
    git 'https://github.com/sugbhatt/myrepo'
  }
  stage('Clean') {
    sh 'mvn clean'
  }
}
