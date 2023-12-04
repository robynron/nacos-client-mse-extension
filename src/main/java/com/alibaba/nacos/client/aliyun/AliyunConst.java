package com.alibaba.nacos.client.aliyun;

/**
 * the Const Values of Aliyun.
 *
 * @author luyanbo(RobberPhex)
 */
public class AliyunConst {
    
    public static final String ENCODE_UTF8 = "UTF-8";
    
    public static final String KMS_ENDPOINT = "kmsEndpoint";

    public static final String KMS_VERSION_KEY = "kmsVersion";

    public static final String KMS_DEFAULT_KEY_ID_VALUE = "alias/acs/mse";
    
    public static final String REGION_ID = "regionId";
    
    public static final String KMS_REGION_ID = "kms_region_id";
    
    public static final String KEY_ID = "keyId";

    public static final String KMS_CLIENT_KEY_FILE_PATH_KEY = "kmsClientKeyFilePath";

    public static final String KMS_CLIENT_KEY_CONTENT_KEY = "kmsClientKeyContent";

    public static final String KMS_PASSWORD_KEY = "kmsPasswordKey";

    public static final String KMS_CA_FILE_PATH_KEY = "kmsCaFilePath";

    public static final String KMS_CA_FILE_CONTENT = "kmsCaFileContent";

    public static final String MSE_ENCRYPTED_CONFIG_USAGE_DOCUMENT_URL = "https://help.aliyun.com/zh/mse/user-guide/create-and-use-encrypted-configurations?spm=a2c4g.11186623.0.0.55587becdOW3jf";
    
    public static final String NACOS_CONFIG_ENCRYPTION_KMS_LOCAL_CACHE_SWITCH = "nacos.config.encryption.kms.local.cache.switch";
    
    public static final boolean DEFAULT_KMS_LOCAL_CACHE_SWITCH = true;
    
    public static final String NACOS_CONFIG_ENCRYPTION_KMS_LOCAL_CACHE_SIZE = "nacos.config.encryption.kms.local.cache.maxSize";
    
    public static final int DEFAULT_KMS_LOCAL_CACHE_MAX_SIZE = 1000;
    
    public static final String NACOS_CONFIG_ENCRYPTION_KMS_LOCAL_CACHE_AFTER_ACCESS_DURATION = "nacos.config.encryption.kms.local.cache.afterAccessDuration";
    
    public static final int DEFAULT_KMS_LOCAL_CACHE_AFTER_ACCESS_DURATION_SECONDS = 60 * 60;
    
    public static final String NACOS_CONFIG_ENCRYPTION_KMS_LOCAL_CACHE_AFTER_WRITE_DURATION = "nacos.config.encryption.kms.local.cache.afterWriteDuration";
    
    public static final int DEFAULT_KMS_LOCAL_CACHE_AFTER_WRITE_DURATION_SECONDS = 60 * 60 * 24;

    public static String formatHelpMessage(String errorMessage) {
        return String.format("%s, for more information, please check: %s",
                        errorMessage, AliyunConst.MSE_ENCRYPTED_CONFIG_USAGE_DOCUMENT_URL);
    }

    public enum KmsVersion {
        Kmsv1("v1.0"),
        Kmsv3("v3.0"),
        UNKNOWN_VERSION("unknown version");

        private String value;

        KmsVersion(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public static KmsVersion fromValue(String value) {
            for (KmsVersion version : values()) {
                if (version.getValue().equals(value)) {
                    return version;
                }
            }
            return UNKNOWN_VERSION;
        }

    }
}
