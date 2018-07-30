pipeline {
  agent {
    node {
      label 'maven'
    }
    
  }
  stages {
    stage('Clean') {
      steps {
        sh '''mvn clean
'''
      }
    }
  }
}