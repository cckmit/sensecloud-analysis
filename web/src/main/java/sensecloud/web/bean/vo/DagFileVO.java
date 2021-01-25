package sensecloud.web.bean.vo;

import lombok.Data;

import java.math.BigInteger;

@Data
public class DagFileVO {

    private String fileLoc;
    private BigInteger fileLocHash;
    private String fileName;
    private String groupName;
    private String sourceCode;

}
