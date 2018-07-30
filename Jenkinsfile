pipeline {
  agent {
    node {
      label 'mvn'
    }
    
  }
  stages {
    stage('Clean') {
      steps {
        sh 'mvn clean'
      }
    }
  }
}
