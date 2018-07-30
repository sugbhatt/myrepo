pipeline {
  agent {
    node {
      label 'maven'
    }
    
  }
  stages {
    stage('Clean') {
      def mvnHome = tool name: 'M3', type: 'maven'
      steps {
        sh "${mvnHome}/bin/mvn clean"
      }
    }
  }
}
