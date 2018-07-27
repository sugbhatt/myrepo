pipeline {
  agent {
    node {
      label 'maven'
    }
    
  }
  stages {
    stage('Build') {
      steps {
        sh 'echo PATH = ${PATH}'
      }
    }
  }
}