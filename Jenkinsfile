node {
  agent any
  
  environment {
   http_proxy = 'http://proxy.cognizant.com:6050'
   https_proxy = 'http://proxy.cognizant.com:6050'  
  }
  
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
