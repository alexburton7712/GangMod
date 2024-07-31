package net.alex.gangmod.entity.client;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

import javax.swing.text.html.parser.Entity;

public class FishyModel<T extends Entity> extends HierarchicalModel {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custommodel"), "main");
	private final ModelPart fishy;
	private final ModelPart face;
	private final ModelPart top;
	private final ModelPart mainbody;
	private final ModelPart fins;

	public FishyModel(ModelPart root) {
		this.fishy = root.getChild("fishy");
		this.face = root.getChild("face");
		this.top = root.getChild("top");
		this.mainbody = root.getChild("mainbody");
		this.fins = root.getChild("fins");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fishy = partdefinition.addOrReplaceChild("fishy", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 18.0F, -0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition face = fishy.addOrReplaceChild("face", CubeListBuilder.create().texOffs(-3, -3).addBox(3.0F, -5.0F, -3.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.5F));

		PartDefinition top = fishy.addOrReplaceChild("top", CubeListBuilder.create().texOffs(9, 14).addBox(-2.0F, -7.0F, -3.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.5F));

		PartDefinition mainbody = fishy.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(-1, 7).addBox(-4.0F, -1.0F, -4.0F, 8.0F, -5.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 8).addBox(-5.0F, -5.0F, -3.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(-1, 0).addBox(-4.0F, -2.0F, -3.0F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.5F));

		PartDefinition fins = fishy.addOrReplaceChild("fins", CubeListBuilder.create().texOffs(19, 0).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 0).addBox(-6.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 0).addBox(-1.0F, 3.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(19, 0).addBox(-9.0F, 2.0F, 1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 0).addBox(-1.0F, 3.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, -1.5F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}


	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fishy.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return fishy;
	}


	@Override
	public void setupAnim(net.minecraft.world.entity.Entity pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {

	}
}