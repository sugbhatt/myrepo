pipeline {
  agent {
    node {
      label 'maven'
    }
    
  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package -s settings.xml'
      }
    }
    stage('Deploy & Test') {
      steps {
        sh 'mvn fabric8:deploy -s settings.xml'
      }
    }
  }
}