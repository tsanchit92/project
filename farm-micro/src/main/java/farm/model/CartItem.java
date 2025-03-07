package farm.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cartItem")
public class CartItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	public String cropName;
	public String cropType;
	public int cropPrice;
	public int  cropId;
	private int quantity;
	@JsonIgnore
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name = "userName",referencedColumnName = "userName")
	private FarmModel farmModel;
	private  int cost;
	public CartItem(String cropName, String cropType, int cropPrice, int cropId, int quantity, FarmModel farmModel,
			int cost) {
		super();
		this.cropName = cropName;
		this.cropType = cropType;
		this.cropPrice = cropPrice;
		this.cropId = cropId;
		this.quantity = quantity;
		this.farmModel = farmModel;
		this.cost = cost;
	}
	
	
	


}
