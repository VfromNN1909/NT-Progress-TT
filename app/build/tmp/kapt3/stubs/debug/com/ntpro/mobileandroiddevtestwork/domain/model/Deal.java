package com.ntpro.mobileandroiddevtestwork.domain.model;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001&B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\fH\u00c6\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\'"}, d2 = {"Lcom/ntpro/mobileandroiddevtestwork/domain/model/Deal;", "", "id", "", "timeStamp", "Ljava/util/Date;", "instrumentName", "", "price", "", "amount", "side", "Lcom/ntpro/mobileandroiddevtestwork/domain/model/Deal$Side;", "(JLjava/util/Date;Ljava/lang/String;DDLcom/ntpro/mobileandroiddevtestwork/domain/model/Deal$Side;)V", "getAmount", "()D", "getId", "()J", "getInstrumentName", "()Ljava/lang/String;", "getPrice", "getSide", "()Lcom/ntpro/mobileandroiddevtestwork/domain/model/Deal$Side;", "getTimeStamp", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Side", "app_debug"})
public final class Deal {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.util.Date timeStamp = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String instrumentName = null;
    private final double price = 0.0;
    private final double amount = 0.0;
    @org.jetbrains.annotations.NotNull
    private final com.ntpro.mobileandroiddevtestwork.domain.model.Deal.Side side = null;
    
    public Deal(long id, @org.jetbrains.annotations.NotNull
    java.util.Date timeStamp, @org.jetbrains.annotations.NotNull
    java.lang.String instrumentName, double price, double amount, @org.jetbrains.annotations.NotNull
    com.ntpro.mobileandroiddevtestwork.domain.model.Deal.Side side) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getTimeStamp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getInstrumentName() {
        return null;
    }
    
    public final double getPrice() {
        return 0.0;
    }
    
    public final double getAmount() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ntpro.mobileandroiddevtestwork.domain.model.Deal.Side getSide() {
        return null;
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ntpro.mobileandroiddevtestwork.domain.model.Deal.Side component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ntpro.mobileandroiddevtestwork.domain.model.Deal copy(long id, @org.jetbrains.annotations.NotNull
    java.util.Date timeStamp, @org.jetbrains.annotations.NotNull
    java.lang.String instrumentName, double price, double amount, @org.jetbrains.annotations.NotNull
    com.ntpro.mobileandroiddevtestwork.domain.model.Deal.Side side) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/ntpro/mobileandroiddevtestwork/domain/model/Deal$Side;", "", "(Ljava/lang/String;I)V", "SELL", "BUY", "app_debug"})
    public static enum Side {
        /*public static final*/ SELL /* = new SELL() */,
        /*public static final*/ BUY /* = new BUY() */;
        
        Side() {
        }
    }
}