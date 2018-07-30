pipeline {
  agent {
    node {
      label 'maven'
    }
    
  }
  stages {
    stage('Clean') {
      steps {
        def mvnHome = tool name: 'M3', type: 'maven'
        sh "${mvnHome}/bin/mvn clean"
      }
    }
  }
}
