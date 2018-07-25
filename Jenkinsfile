pipeline {
  agent {
    node {
      label 'mvn'
    }
    
  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package'
      }
    }
    stage('Deploy & Test') {
      steps {
        sh 'mvn fabric8:deploy'
      }
    }
    stage('Promote to QA') {
      steps {
        sh 'oc tag 683211-boot-project/myrepo:latest 683211-boot-project/myrepo:promoteToQA'
      }
    }
  }
}