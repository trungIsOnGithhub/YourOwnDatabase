import org.springframework.beans.factory.annotation.Value;

@Configuration
public class AwsS3Config {
    // https://ducmanhphan.github.io/2019-02-20-Uploading-files-with-AWS-S3-spring-boot/
    // Ref above linK
    @Value("${mpd.aws.access_key_id}")
    private String awsId;
    
    @Value("${mpd.aws.secret_access_key}")
    private String awsKey;
    
    @Value("${mpd.s3.region}")
    private String region;
    
    @Bean 
    public AmazonS3 s3client() {
            BasicAWSCredentials awsCreds = new BasicAWSCredentials(awsId, awsKey);
            AmazonS3 s3Client = AmazonS3ClientBuilder.standard().withRegion(Regions.fromName(region))
                                                    .withCredentials(new AWSStaticCredentialsProvider(awsCreds))
                                                    .build();
            return s3Client;
    }
}
