package ec.edu.espe.tercerparcial.ventas.domain;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@Document(collection = "Venta")
public class Venta {
    @Id
    private String id;

    @Field("codigo_unico")
    private String codigoProducto;

    @Field("fecha_venta")
    private Date fechaVenta;

    @Field("nombre")
    private String nombre;

    @Field("precio_unitario")
    private Double precioUnitario;

    @Field("cantidad")
    private Integer cantidad;

    @Field("valor_total")
    private Double valorTotal;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Venta other = (Venta) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Venta [id=" + id + ", codigoProducto=" + codigoProducto + ", fechaVenta=" + fechaVenta + ", nombre="
                + nombre + ", precioUnitario=" + precioUnitario + ", cantidad=" + cantidad + ", valorTotal="
                + valorTotal + "]";
    }



    
}
