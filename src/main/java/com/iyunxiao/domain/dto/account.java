package packageModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class account implements Serializable {

    private static final long serialVersionUID = 1562641818520L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 
    * isNullAble:1,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime gmtCreate;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime gmtModified;

    /**
    * 
    * isNullAble:1
    */
    private String testAccount;

    /**
    * 
    * isNullAble:1
    */
    private String testPassword;

    /**
    * 这个字段指向项目id

    * isNullAble:1
    */
    private Long projectId;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setGmtCreate(java.time.LocalDateTime gmtCreate){this.gmtCreate = gmtCreate;}

    public java.time.LocalDateTime getGmtCreate(){return this.gmtCreate;}

    public void setGmtModified(java.time.LocalDateTime gmtModified){this.gmtModified = gmtModified;}

    public java.time.LocalDateTime getGmtModified(){return this.gmtModified;}

    public void setTestAccount(String testAccount){this.testAccount = testAccount;}

    public String getTestAccount(){return this.testAccount;}

    public void setTestPassword(String testPassword){this.testPassword = testPassword;}

    public String getTestPassword(){return this.testPassword;}

    public void setProjectId(Long projectId){this.projectId = projectId;}

    public Long getProjectId(){return this.projectId;}
    @Override
    public String toString() {
        return "account{" +
                "id='" + id + '\'' +
                "gmtCreate='" + gmtCreate + '\'' +
                "gmtModified='" + gmtModified + '\'' +
                "testAccount='" + testAccount + '\'' +
                "testPassword='" + testPassword + '\'' +
                "projectId='" + projectId + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private account set;

        private ConditionBuilder where;

        public UpdateBuilder set(account set){
            this.set = set;
            return this;
        }

        public account getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends account{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<java.time.LocalDateTime> gmtCreateList;

        public List<java.time.LocalDateTime> getGmtCreateList(){return this.gmtCreateList;}

        private java.time.LocalDateTime gmtCreateSt;

        private java.time.LocalDateTime gmtCreateEd;

        public java.time.LocalDateTime getGmtCreateSt(){return this.gmtCreateSt;}

        public java.time.LocalDateTime getGmtCreateEd(){return this.gmtCreateEd;}

        private List<java.time.LocalDateTime> gmtModifiedList;

        public List<java.time.LocalDateTime> getGmtModifiedList(){return this.gmtModifiedList;}

        private java.time.LocalDateTime gmtModifiedSt;

        private java.time.LocalDateTime gmtModifiedEd;

        public java.time.LocalDateTime getGmtModifiedSt(){return this.gmtModifiedSt;}

        public java.time.LocalDateTime getGmtModifiedEd(){return this.gmtModifiedEd;}

        private List<String> testAccountList;

        public List<String> getTestAccountList(){return this.testAccountList;}


        private List<String> fuzzyTestAccount;

        public List<String> getFuzzyTestAccount(){return this.fuzzyTestAccount;}

        private List<String> rightFuzzyTestAccount;

        public List<String> getRightFuzzyTestAccount(){return this.rightFuzzyTestAccount;}
        private List<String> testPasswordList;

        public List<String> getTestPasswordList(){return this.testPasswordList;}


        private List<String> fuzzyTestPassword;

        public List<String> getFuzzyTestPassword(){return this.fuzzyTestPassword;}

        private List<String> rightFuzzyTestPassword;

        public List<String> getRightFuzzyTestPassword(){return this.rightFuzzyTestPassword;}
        private List<Long> projectIdList;

        public List<Long> getProjectIdList(){return this.projectIdList;}

        private Long projectIdSt;

        private Long projectIdEd;

        public Long getProjectIdSt(){return this.projectIdSt;}

        public Long getProjectIdEd(){return this.projectIdEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Long id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder gmtCreateBetWeen(java.time.LocalDateTime gmtCreateSt,java.time.LocalDateTime gmtCreateEd){
            this.gmtCreateSt = gmtCreateSt;
            this.gmtCreateEd = gmtCreateEd;
            return this;
        }

        public QueryBuilder gmtCreateGreaterEqThan(java.time.LocalDateTime gmtCreateSt){
            this.gmtCreateSt = gmtCreateSt;
            return this;
        }
        public QueryBuilder gmtCreateLessEqThan(java.time.LocalDateTime gmtCreateEd){
            this.gmtCreateEd = gmtCreateEd;
            return this;
        }


        public QueryBuilder gmtCreate(java.time.LocalDateTime gmtCreate){
            setGmtCreate(gmtCreate);
            return this;
        }

        public QueryBuilder gmtCreateList(java.time.LocalDateTime ... gmtCreate){
            this.gmtCreateList = solveNullList(gmtCreate);
            return this;
        }

        public QueryBuilder gmtCreateList(List<java.time.LocalDateTime> gmtCreate){
            this.gmtCreateList = gmtCreate;
            return this;
        }

        public QueryBuilder fetchGmtCreate(){
            setFetchFields("fetchFields","gmtCreate");
            return this;
        }

        public QueryBuilder excludeGmtCreate(){
            setFetchFields("excludeFields","gmtCreate");
            return this;
        }

        public QueryBuilder gmtModifiedBetWeen(java.time.LocalDateTime gmtModifiedSt,java.time.LocalDateTime gmtModifiedEd){
            this.gmtModifiedSt = gmtModifiedSt;
            this.gmtModifiedEd = gmtModifiedEd;
            return this;
        }

        public QueryBuilder gmtModifiedGreaterEqThan(java.time.LocalDateTime gmtModifiedSt){
            this.gmtModifiedSt = gmtModifiedSt;
            return this;
        }
        public QueryBuilder gmtModifiedLessEqThan(java.time.LocalDateTime gmtModifiedEd){
            this.gmtModifiedEd = gmtModifiedEd;
            return this;
        }


        public QueryBuilder gmtModified(java.time.LocalDateTime gmtModified){
            setGmtModified(gmtModified);
            return this;
        }

        public QueryBuilder gmtModifiedList(java.time.LocalDateTime ... gmtModified){
            this.gmtModifiedList = solveNullList(gmtModified);
            return this;
        }

        public QueryBuilder gmtModifiedList(List<java.time.LocalDateTime> gmtModified){
            this.gmtModifiedList = gmtModified;
            return this;
        }

        public QueryBuilder fetchGmtModified(){
            setFetchFields("fetchFields","gmtModified");
            return this;
        }

        public QueryBuilder excludeGmtModified(){
            setFetchFields("excludeFields","gmtModified");
            return this;
        }

        public QueryBuilder fuzzyTestAccount (List<String> fuzzyTestAccount){
            this.fuzzyTestAccount = fuzzyTestAccount;
            return this;
        }

        public QueryBuilder fuzzyTestAccount (String ... fuzzyTestAccount){
            this.fuzzyTestAccount = solveNullList(fuzzyTestAccount);
            return this;
        }

        public QueryBuilder rightFuzzyTestAccount (List<String> rightFuzzyTestAccount){
            this.rightFuzzyTestAccount = rightFuzzyTestAccount;
            return this;
        }

        public QueryBuilder rightFuzzyTestAccount (String ... rightFuzzyTestAccount){
            this.rightFuzzyTestAccount = solveNullList(rightFuzzyTestAccount);
            return this;
        }

        public QueryBuilder testAccount(String testAccount){
            setTestAccount(testAccount);
            return this;
        }

        public QueryBuilder testAccountList(String ... testAccount){
            this.testAccountList = solveNullList(testAccount);
            return this;
        }

        public QueryBuilder testAccountList(List<String> testAccount){
            this.testAccountList = testAccount;
            return this;
        }

        public QueryBuilder fetchTestAccount(){
            setFetchFields("fetchFields","testAccount");
            return this;
        }

        public QueryBuilder excludeTestAccount(){
            setFetchFields("excludeFields","testAccount");
            return this;
        }

        public QueryBuilder fuzzyTestPassword (List<String> fuzzyTestPassword){
            this.fuzzyTestPassword = fuzzyTestPassword;
            return this;
        }

        public QueryBuilder fuzzyTestPassword (String ... fuzzyTestPassword){
            this.fuzzyTestPassword = solveNullList(fuzzyTestPassword);
            return this;
        }

        public QueryBuilder rightFuzzyTestPassword (List<String> rightFuzzyTestPassword){
            this.rightFuzzyTestPassword = rightFuzzyTestPassword;
            return this;
        }

        public QueryBuilder rightFuzzyTestPassword (String ... rightFuzzyTestPassword){
            this.rightFuzzyTestPassword = solveNullList(rightFuzzyTestPassword);
            return this;
        }

        public QueryBuilder testPassword(String testPassword){
            setTestPassword(testPassword);
            return this;
        }

        public QueryBuilder testPasswordList(String ... testPassword){
            this.testPasswordList = solveNullList(testPassword);
            return this;
        }

        public QueryBuilder testPasswordList(List<String> testPassword){
            this.testPasswordList = testPassword;
            return this;
        }

        public QueryBuilder fetchTestPassword(){
            setFetchFields("fetchFields","testPassword");
            return this;
        }

        public QueryBuilder excludeTestPassword(){
            setFetchFields("excludeFields","testPassword");
            return this;
        }

        public QueryBuilder projectIdBetWeen(Long projectIdSt,Long projectIdEd){
            this.projectIdSt = projectIdSt;
            this.projectIdEd = projectIdEd;
            return this;
        }

        public QueryBuilder projectIdGreaterEqThan(Long projectIdSt){
            this.projectIdSt = projectIdSt;
            return this;
        }
        public QueryBuilder projectIdLessEqThan(Long projectIdEd){
            this.projectIdEd = projectIdEd;
            return this;
        }


        public QueryBuilder projectId(Long projectId){
            setProjectId(projectId);
            return this;
        }

        public QueryBuilder projectIdList(Long ... projectId){
            this.projectIdList = solveNullList(projectId);
            return this;
        }

        public QueryBuilder projectIdList(List<Long> projectId){
            this.projectIdList = projectId;
            return this;
        }

        public QueryBuilder fetchProjectId(){
            setFetchFields("fetchFields","projectId");
            return this;
        }

        public QueryBuilder excludeProjectId(){
            setFetchFields("excludeFields","projectId");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public account build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<java.time.LocalDateTime> gmtCreateList;

        public List<java.time.LocalDateTime> getGmtCreateList(){return this.gmtCreateList;}

        private java.time.LocalDateTime gmtCreateSt;

        private java.time.LocalDateTime gmtCreateEd;

        public java.time.LocalDateTime getGmtCreateSt(){return this.gmtCreateSt;}

        public java.time.LocalDateTime getGmtCreateEd(){return this.gmtCreateEd;}

        private List<java.time.LocalDateTime> gmtModifiedList;

        public List<java.time.LocalDateTime> getGmtModifiedList(){return this.gmtModifiedList;}

        private java.time.LocalDateTime gmtModifiedSt;

        private java.time.LocalDateTime gmtModifiedEd;

        public java.time.LocalDateTime getGmtModifiedSt(){return this.gmtModifiedSt;}

        public java.time.LocalDateTime getGmtModifiedEd(){return this.gmtModifiedEd;}

        private List<String> testAccountList;

        public List<String> getTestAccountList(){return this.testAccountList;}


        private List<String> fuzzyTestAccount;

        public List<String> getFuzzyTestAccount(){return this.fuzzyTestAccount;}

        private List<String> rightFuzzyTestAccount;

        public List<String> getRightFuzzyTestAccount(){return this.rightFuzzyTestAccount;}
        private List<String> testPasswordList;

        public List<String> getTestPasswordList(){return this.testPasswordList;}


        private List<String> fuzzyTestPassword;

        public List<String> getFuzzyTestPassword(){return this.fuzzyTestPassword;}

        private List<String> rightFuzzyTestPassword;

        public List<String> getRightFuzzyTestPassword(){return this.rightFuzzyTestPassword;}
        private List<Long> projectIdList;

        public List<Long> getProjectIdList(){return this.projectIdList;}

        private Long projectIdSt;

        private Long projectIdEd;

        public Long getProjectIdSt(){return this.projectIdSt;}

        public Long getProjectIdEd(){return this.projectIdEd;}


        public ConditionBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder gmtCreateBetWeen(java.time.LocalDateTime gmtCreateSt,java.time.LocalDateTime gmtCreateEd){
            this.gmtCreateSt = gmtCreateSt;
            this.gmtCreateEd = gmtCreateEd;
            return this;
        }

        public ConditionBuilder gmtCreateGreaterEqThan(java.time.LocalDateTime gmtCreateSt){
            this.gmtCreateSt = gmtCreateSt;
            return this;
        }
        public ConditionBuilder gmtCreateLessEqThan(java.time.LocalDateTime gmtCreateEd){
            this.gmtCreateEd = gmtCreateEd;
            return this;
        }


        public ConditionBuilder gmtCreateList(java.time.LocalDateTime ... gmtCreate){
            this.gmtCreateList = solveNullList(gmtCreate);
            return this;
        }

        public ConditionBuilder gmtCreateList(List<java.time.LocalDateTime> gmtCreate){
            this.gmtCreateList = gmtCreate;
            return this;
        }

        public ConditionBuilder gmtModifiedBetWeen(java.time.LocalDateTime gmtModifiedSt,java.time.LocalDateTime gmtModifiedEd){
            this.gmtModifiedSt = gmtModifiedSt;
            this.gmtModifiedEd = gmtModifiedEd;
            return this;
        }

        public ConditionBuilder gmtModifiedGreaterEqThan(java.time.LocalDateTime gmtModifiedSt){
            this.gmtModifiedSt = gmtModifiedSt;
            return this;
        }
        public ConditionBuilder gmtModifiedLessEqThan(java.time.LocalDateTime gmtModifiedEd){
            this.gmtModifiedEd = gmtModifiedEd;
            return this;
        }


        public ConditionBuilder gmtModifiedList(java.time.LocalDateTime ... gmtModified){
            this.gmtModifiedList = solveNullList(gmtModified);
            return this;
        }

        public ConditionBuilder gmtModifiedList(List<java.time.LocalDateTime> gmtModified){
            this.gmtModifiedList = gmtModified;
            return this;
        }

        public ConditionBuilder fuzzyTestAccount (List<String> fuzzyTestAccount){
            this.fuzzyTestAccount = fuzzyTestAccount;
            return this;
        }

        public ConditionBuilder fuzzyTestAccount (String ... fuzzyTestAccount){
            this.fuzzyTestAccount = solveNullList(fuzzyTestAccount);
            return this;
        }

        public ConditionBuilder rightFuzzyTestAccount (List<String> rightFuzzyTestAccount){
            this.rightFuzzyTestAccount = rightFuzzyTestAccount;
            return this;
        }

        public ConditionBuilder rightFuzzyTestAccount (String ... rightFuzzyTestAccount){
            this.rightFuzzyTestAccount = solveNullList(rightFuzzyTestAccount);
            return this;
        }

        public ConditionBuilder testAccountList(String ... testAccount){
            this.testAccountList = solveNullList(testAccount);
            return this;
        }

        public ConditionBuilder testAccountList(List<String> testAccount){
            this.testAccountList = testAccount;
            return this;
        }

        public ConditionBuilder fuzzyTestPassword (List<String> fuzzyTestPassword){
            this.fuzzyTestPassword = fuzzyTestPassword;
            return this;
        }

        public ConditionBuilder fuzzyTestPassword (String ... fuzzyTestPassword){
            this.fuzzyTestPassword = solveNullList(fuzzyTestPassword);
            return this;
        }

        public ConditionBuilder rightFuzzyTestPassword (List<String> rightFuzzyTestPassword){
            this.rightFuzzyTestPassword = rightFuzzyTestPassword;
            return this;
        }

        public ConditionBuilder rightFuzzyTestPassword (String ... rightFuzzyTestPassword){
            this.rightFuzzyTestPassword = solveNullList(rightFuzzyTestPassword);
            return this;
        }

        public ConditionBuilder testPasswordList(String ... testPassword){
            this.testPasswordList = solveNullList(testPassword);
            return this;
        }

        public ConditionBuilder testPasswordList(List<String> testPassword){
            this.testPasswordList = testPassword;
            return this;
        }

        public ConditionBuilder projectIdBetWeen(Long projectIdSt,Long projectIdEd){
            this.projectIdSt = projectIdSt;
            this.projectIdEd = projectIdEd;
            return this;
        }

        public ConditionBuilder projectIdGreaterEqThan(Long projectIdSt){
            this.projectIdSt = projectIdSt;
            return this;
        }
        public ConditionBuilder projectIdLessEqThan(Long projectIdEd){
            this.projectIdEd = projectIdEd;
            return this;
        }


        public ConditionBuilder projectIdList(Long ... projectId){
            this.projectIdList = solveNullList(projectId);
            return this;
        }

        public ConditionBuilder projectIdList(List<Long> projectId){
            this.projectIdList = projectId;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private account obj;

        public Builder(){
            this.obj = new account();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder gmtCreate(java.time.LocalDateTime gmtCreate){
            this.obj.setGmtCreate(gmtCreate);
            return this;
        }
        public Builder gmtModified(java.time.LocalDateTime gmtModified){
            this.obj.setGmtModified(gmtModified);
            return this;
        }
        public Builder testAccount(String testAccount){
            this.obj.setTestAccount(testAccount);
            return this;
        }
        public Builder testPassword(String testPassword){
            this.obj.setTestPassword(testPassword);
            return this;
        }
        public Builder projectId(Long projectId){
            this.obj.setProjectId(projectId);
            return this;
        }
        public account build(){return obj;}
    }

}
