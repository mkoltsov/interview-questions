package md.gypsy.testing.projects.workflow.data.dataModels.dpRequest.DPAccountDataModel;

import md.gypsy.testing.projects.cot.models.Product;
import md.gypsy.testing.projects.workflow.data.dataModels.dpRequest.rxm.RxmModel;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
* Created with IntelliJ IDEA.
* User: serhiymy
* Date: 1/22/15
* Time: 4:39 PM
* To change this template use File | Settings | File Templates.
*/
public class DPAccountModel {

   private List<Product> products;

   private DPAccountFXDetailsModel dpAccountFXDetailsModel;
   // private DPAccountSwissDetailsModel dpAccountSwissDetailsModel;//todo
   private String doxAgreementID;
   private String masterStamm;
   private String accountType;
   private String accountMirroring;
   private String businessJustification;
   private String fundName;//todo replace with list of UPs or use list of UPs from clients data
   //    private String alertAcronym;
//    private String alertAccessCode;
//    private String taxID;
   private String bookingNameFormat;
   private String bookingName;
   //    private Boolean changeDefaultBookingName;
   private String bookingShortName;
   //    private String iStarNumber;
//    private Boolean linkAccount;
//    private String specialConfirmationRequirement;
//    private String mpid;
   private String cisClientType;
   private String rxmName;
   private RxmModel rxm;
   private String gl;
   private String index;//internal DP field which is auto-generated by DP and defines certain account in car, on instructions page, on credit request page;
   //todo implement other valuable fields
   // todo add more hierarchy levels like: separate alert details for whole request, booking details entity, other details entity

   public List<Product> getProducts() {
      return products;
   }

   public String getGl() {
      return gl;
   }

   public void setGl(String gl) {
      this.gl = gl;
   }

   public void setProducts(Product product) {
      this.products = new ArrayList<>(asList(product));
   }

   public void setProducts(List<Product> products) {
      this.products = products;
   }

   public RxmModel getRxm() {
      return rxm;
   }

   public void setRxm(RxmModel rxm) {
      this.rxm = rxm;
   }

   public String getIndex() {
      return index;
   }

   public void setIndex(String index) {
      this.index = index;
   }

   public String getBookingName() {
      return bookingName;
   }

   public void setBookingName(String bookingName) {
      this.bookingName = bookingName;
   }

   public String getBookingShortName() {
      return bookingShortName;
   }

   public void setBookingShortName(String bookingShortName) {
      this.bookingShortName = bookingShortName;
   }

   public String getDoxAgreementID() {
      return doxAgreementID;
   }

   public DPAccountFXDetailsModel getDpAccountFXDetailsModel() {
      return dpAccountFXDetailsModel;
   }

   public void setDpAccountFXDetailsModel(DPAccountFXDetailsModel dpAccountFXDetailsModel) {
      this.dpAccountFXDetailsModel = dpAccountFXDetailsModel;
   }

   public void setDoxAgreementID(String doxAgreementID) {
      this.doxAgreementID = doxAgreementID;
   }

   public String getBookingNameFormat() {
      return bookingNameFormat;
   }

   public void setBookingNameFormat(String bookingNameFormat) {
      this.bookingNameFormat = bookingNameFormat;
   }

   public String getCisClientType() {
      return cisClientType;
   }

   public void setCisClientType(String cisClientType) {
      this.cisClientType = cisClientType;
   }

   public String getMasterStamm() {
      return masterStamm;
   }

   public void setMasterStamm(String masterStamm) {
      this.masterStamm = masterStamm;
   }

   public String getAccountType() {
      return accountType;
   }

   public void setAccountType(String accountType) {
      this.accountType = accountType;
   }

   public String getAccountMirroring() {
      return accountMirroring;
   }

   public void setAccountMirroring(String accountMirroring) {
      this.accountMirroring = accountMirroring;
   }

   public String getBusinessJustification() {
      return businessJustification;
   }

   public void setBusinessJustification(String businessJustification) {
      this.businessJustification = businessJustification;
   }

   public String getFundName() {
      return fundName;
   }

   public DPAccountModel setFundName(String fundName) {
      this.fundName = fundName;
      return this;
   }

   public String getRxmName() {
      return rxmName;
   }

   public DPAccountModel setRxmName(String rxmName) {
      this.rxmName = rxmName;
      return this;
   }

   public static class Builder {
      private DPAccountModel dpAccountModel = new DPAccountModel();

      public Builder() {
      }

      public Builder(DPAccountModel oldDPAccountModel) {
         if (null == oldDPAccountModel) {
            return;
         }
         dpAccountModel.setProducts(oldDPAccountModel.getProducts());
         dpAccountModel.setDpAccountFXDetailsModel(oldDPAccountModel.getDpAccountFXDetailsModel());
         dpAccountModel.setDoxAgreementID(oldDPAccountModel.getDoxAgreementID());
         dpAccountModel.setFundName(oldDPAccountModel.getFundName());
         dpAccountModel.setRxmName(oldDPAccountModel.getRxmName());
         dpAccountModel.setBookingNameFormat(oldDPAccountModel.getBookingNameFormat());
         dpAccountModel.setCisClientType(oldDPAccountModel.getCisClientType());
         dpAccountModel.setAccountType(oldDPAccountModel.getAccountType());
         dpAccountModel.setMasterStamm(oldDPAccountModel.getMasterStamm());
         dpAccountModel.setBusinessJustification(oldDPAccountModel.getBusinessJustification());
         dpAccountModel.setAccountMirroring(oldDPAccountModel.getAccountMirroring());
         dpAccountModel.setBookingShortName(oldDPAccountModel.getBookingShortName());
         dpAccountModel.setRxm(oldDPAccountModel.getRxm());
         dpAccountModel.setGl(oldDPAccountModel.getGl());
         dpAccountModel.setBookingName(oldDPAccountModel.getBookingName());
      }

      public DPAccountModel build() {
         return dpAccountModel;
      }

      public Builder setProducts(List<Product> products) {
         dpAccountModel.products = products;
         return this;
      }

      public Builder setGL(String gl) {
         dpAccountModel.gl = gl;
         return this;
      }

      public Builder setRXM(RxmModel rxm) {
         dpAccountModel.rxm = rxm;
         return this;
      }

      public Builder setBookingName(String s) {
         dpAccountModel.bookingName = s;
         return this;
      }

      public Builder setBookingShortName(String s) {
         dpAccountModel.bookingShortName = s;
         return this;
      }

      public Builder setDpAccountFXDetailsModel(DPAccountFXDetailsModel dpAccountFXDetailsModel1) {
         dpAccountModel.dpAccountFXDetailsModel = dpAccountFXDetailsModel1;
         return this;
      }

      public Builder setDoxAgreementID(String s) {
         dpAccountModel.doxAgreementID = s;
         return this;
      }

      public Builder setBookingNameFormat(String s) {
         dpAccountModel.bookingNameFormat = s;
         return this;
      }

      public Builder setCisClientType(String s) {
         dpAccountModel.cisClientType = s;
         return this;
      }

      public Builder setAccountType(String s) {
         dpAccountModel.accountType = s;
         return this;
      }

      public Builder setMasterStamm(String s) {
         dpAccountModel.masterStamm = s;
         return this;
      }

      public Builder setBusinessJustification(String s) {
         dpAccountModel.businessJustification = s;
         return this;
      }

      public Builder setAccountMirroring(String s) {
         dpAccountModel.accountMirroring = s;
         return this;
      }

      public Builder setFundName(String s) {
         dpAccountModel.fundName = s;
         return this;
      }

      public Builder setRxmName(String s) {
         dpAccountModel.rxmName = s;
         return this;
      }
   }

}