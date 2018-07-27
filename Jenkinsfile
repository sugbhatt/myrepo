node {
  agent any
  stage('SCM Checkout') {
    git 'https://github.com/sugbhatt/myrepo'
  }
  stage('Build') {
    def mvnHome = tool name: 'M3', type: 'maven'
    sh "${mvnHome}/bin/mvn clean package"
  }
  stage('Deploy') {
    def mvnHome = tool name: 'M3', type: 'maven'
    sh "${mvnHome}/bin/mvn fabric8:deploy"
  }
}
