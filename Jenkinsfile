node {
 stage ('Clean') {
  def mvnHome = tool name: 'M3', type: 'maven'
  sh "${mvnHome}/bin/mvn clean"
 }
}
