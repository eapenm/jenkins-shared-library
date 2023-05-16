// def call(String project, String ImageTag, String hubUser){
//     withCredentials([usernamePassword(
//             credentialsId: 'docker',
//             usernameVariable: 'USER',
//             passwordVariable: 'PASS'
//     )]) {
//         sh 'docker login -u $USER -p $PASS'
//     }
//     sh "docker image push ${hubUser}/${project}:${ImageTag}"
//     sh "docker image push ${hubUser}/${project}:latest"   
// }


def call(String awsAccoutId,String region, String ecrRepoName){
    
    sh """
     aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${awsAccoutId}.dkr.ecr.${region}.amazonaws.com
     docker push ${awsAccoutId}.dkr.ecr.${region}.amazonaws.com/${ecrRepoName}:latest
    """
}