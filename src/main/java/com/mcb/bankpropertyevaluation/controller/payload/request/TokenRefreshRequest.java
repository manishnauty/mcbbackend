package com.mcb.bankpropertyevaluation.controller.payload.request;


import lombok.Data;

@Data
public class TokenRefreshRequest {
  private String refreshToken;

  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }
}
