package edu.rufus.boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Product {
	@Id
	@GeneratedValue
	private Integer prodId;
	@NonNull
	private String prodName;
	@NonNull
	private Double prodCost;
	@NonNull
	private String prodColor;
}
