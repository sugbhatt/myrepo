node {
  environment { 
    HTTP_PROXY = 'http://proxy.cognizant.com:6050',
    HTTPS_PROXY = 'http://proxy.cognizant.com:6050'  
   }
  stage('SCM Checkout') {
    git 'https://github.com/sugbhatt/myrepo'
  }
  stage('Clean') {
    sh 'mvn clean'
  }
}
