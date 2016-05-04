node {
  checkout([$class: 'GitSCM', branches: [[name: '**']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '03a158c8-e995-4e00-aecd-f60aa46511d7', url: 'https://github.com/ksanjeevnair/mytestTomcat.git']]])

dir('OptimusPrime') {
sh "mvn -B -Dmaven.test.failure.ignore verify"
}
}
